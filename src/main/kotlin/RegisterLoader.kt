class RegisterLoader(private val registerMachine: RegisterMachine) : RegisterBaseListener() {
    private var currLabel = 0

    override fun enterStat(ctx: RegisterParser.StatContext) {
        currLabel = ctx.LABEL().text.substring(1).toInt()
    }

    override fun enterIncrease(ctx: RegisterParser.IncreaseContext) {
        val register = ctx.REGISTER().text.substring(1).toInt()
        val label = ctx.LABEL().text.substring(1).toInt()
        registerMachine.loadCommand(currLabel, IncreaseCommand(register, label))
    }

    override fun enterDecrease(ctx: RegisterParser.DecreaseContext) {
        val register = ctx.REGISTER().text.substring(1).toInt()
        val labelPositive = ctx.LABEL(0).text.substring(1).toInt()
        val labelZero = ctx.LABEL(1).text.substring(1).toInt()
        registerMachine.loadCommand(currLabel, DecreaseCommand(register, labelPositive, labelZero))
    }

    override fun enterHalt(ctx: RegisterParser.HaltContext) {
        registerMachine.loadCommand(currLabel, HaltCommand())
    }
}