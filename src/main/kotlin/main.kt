import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.split
import com.github.ajalt.clikt.parameters.types.file
import com.github.ajalt.clikt.parameters.types.int
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.FileInputStream

class RegisterMachineCLI : CliktCommand(
    help = """
    A simple implementation of a register machine executor
    """
) {
    private val file by option("-f", "--File", help = "File to parse").file(
        mustExist = true,
        canBeDir = false,
        mustBeReadable = true
    )
    private val registers by option(
        "-r",
        "--registers",
        help = "Initial values of the registers (in order) separated by ','"
    ).split(",")
        .default(listOf())
    private val start by option("-s", "--start", help = "Starting label").int().default(0)

    override fun run() {
        val inputStream = if (file == null) {
            System.`in`
        } else {
            FileInputStream(file!!)
        }

        val input = CharStreams.fromStream(inputStream)
        val lexer = RegisterLexer(input)
        val tokens = CommonTokenStream(lexer)
        val parser = RegisterParser(tokens)
        val tree = parser.prog()

        val walker = ParseTreeWalker()

        val initialState = registers.map(String::toInt).withIndex().map { it.index to it.value }.toMap().toMutableMap()
        val registerMachine = RegisterMachine(start, initialState)

        val loader = RegisterLoader(registerMachine)
        walker.walk(loader, tree)

        registerMachine.execute()
    }
}

fun main(args: Array<String>) = RegisterMachineCLI().main(args)
