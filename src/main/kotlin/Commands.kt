interface Command
data class IncreaseCommand(val register: Int, val label: Int) : Command
data class DecreaseCommand(val register: Int, val labelPositive: Int, val labelZero: Int) : Command
class HaltCommand : Command
