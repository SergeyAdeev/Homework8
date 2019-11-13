import junit.framework.TestCase.assertEquals
import org.junit.jupiter.api.Test

class NumberPrinterTest : InOutInstaller() {

    private val numberPrinter = NumberPrinter()
    private val insertNumber = "Введите целое число: "

    @Test
    fun testCorrectNumber() {
        expectedResult = "$insertNumber\r\nВы ввели число: 5\r\n"
        stringInput = 5.toString()
        assertNumberPrinter(expectedResult, stringInput)
    }

    @Test
    fun testStringInput() {
        expectedResult = "$insertNumber\r\nЭто не целое число\r\n"
        stringInput = "Not number"
        assertNumberPrinter(expectedResult, stringInput)
    }

    @Test
    fun testDouble() {
        expectedResult = "$insertNumber\r\nЭто не целое число\r\n"
        stringInput = (-2.5).toString()
        assertNumberPrinter(expectedResult, stringInput)
    }

    @Test
    fun testNullString() {
        expectedResult = "$insertNumber\r\nЭто не целое число\r\n"
        stringInput = ""
        assertNumberPrinter(expectedResult, stringInput)
    }

    private fun assertNumberPrinter(expectedResult: String, stringInput: String) {
        provideInput(stringInput)
        setUpOutput()
        numberPrinter.printNumber()
        assertEquals("printNumber print wrong number", expectedResult, getOutput())
    }
}