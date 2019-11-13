import org.junit.After
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

open class InOutInstaller {
    private val systemIn = System.`in`
    private val systemOut = System.`out`

    private var testIn: ByteArrayInputStream? = null
    private var testOut = ByteArrayOutputStream()

    protected var expectedResult = ""
    protected var stringInput = ""

    protected fun setUpOutput() {
        testOut = ByteArrayOutputStream()
        System.setOut(PrintStream(testOut))
    }

    protected fun provideInput(data: String) {
        testIn = ByteArrayInputStream(data.toByteArray())
        System.setIn(testIn)
    }

    protected fun getOutput(): String {
        return testOut.toString()
    }

    @After
    fun restoreSystemInputOutput() {
        System.setIn(systemIn)
        System.setOut(systemOut)
    }
}