import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.FileInputStream

fun main(args: Array<String>) {

    val inputStream = if (args.isNotEmpty()) {
        FileInputStream(args[0])
    } else {
        System.`in`
    }

    val input = CharStreams.fromStream(inputStream)
    val lexer = RegisterLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = RegisterParser(tokens)
    val tree = parser.prog()

    val walker = ParseTreeWalker()

    val initialState = mutableMapOf(0 to 0, 1 to 7)
    val registerMachine = RegisterMachine(0, initialState)

    val loader = RegisterLoader(registerMachine)
    walker.walk(loader, tree)

    registerMachine.execute()
}
