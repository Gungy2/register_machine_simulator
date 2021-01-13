class RegisterMachine(private var label: Int = 0, val state: MutableMap<Int, Int> = HashMap()) {
    private val instructions = HashMap<Int, Command>()

    fun loadCommand(label: Int, command: Command) {
        instructions[label] = command
    }

    fun execute() {
        var curr: Command = instructions[label] ?: return

        while (curr !is HaltCommand) {
            printState()
            label = executeCommand(curr)
            curr = instructions[label] ?: HaltCommand()
        }
        printState()
    }

    private fun executeCommand(command: Command): Int {
        val next: Int
        when (command) {
            is IncreaseCommand -> {
                state[command.register] = (state[command.register] ?: 0) + 1
                next = command.label
            }
            is DecreaseCommand -> {
                next = if (state[command.register] == null || state[command.register] == 0) {
                    command.labelZero
                } else {
                    state[command.register] = (state[command.register] ?: 0) - 1
                    command.labelPositive
                }
            }
            else -> throw Exception("Invalid command!")
        }
        return next
    }

    private fun printState() {
        print("Next: L$label\tState:  ")
        state.forEach { (reg, value) -> print("R$reg = $value  ") }
        println()
    }
}