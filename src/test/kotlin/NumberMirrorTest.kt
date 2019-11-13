import junit.framework.TestCase
import org.junit.jupiter.api.Test

class NumberMirrorTest : InOutInstaller() {
    private val numberMirror = NumberMirror()
    private val insertNumber = "Введите целое трехзначное число: "

    @Test
    fun testLowerBoundary() {
        expectedResult = "$insertNumber\r\n001"
        stringInput = 100.toString()
        assertNumberPrinter(expectedResult, stringInput)
    }

    @Test
    fun testHigherBoundary() {
        expectedResult = "$insertNumber\r\n999"
        stringInput = 999.toString()
        assertNumberPrinter(expectedResult, stringInput)
    }

    @Test
    fun testInRange() {
        expectedResult = "$insertNumber\r\n532"
        stringInput = 235.toString()
        assertNumberPrinter(expectedResult, stringInput)
    }

    @Test
    fun testOutOfHigherBoundary() {
        expectedResult = "$insertNumber\r\nЧисло должно быть трехзначное\r\n"
        stringInput = 1000.toString()
        assertNumberPrinter(expectedResult, stringInput)
    }

    @Test
    fun testOutOfLowerBoundary() {
        expectedResult = "$insertNumber\r\nЧисло должно быть трехзначное\r\n"
        stringInput = 99.toString()
        assertNumberPrinter(expectedResult, stringInput)
    }

    @Test
    fun testNegativeInRange() {
        expectedResult = "$insertNumber\r\n-417"
        stringInput = (-714).toString()
        assertNumberPrinter(expectedResult, stringInput)
    }

    @Test
    fun testNullString() {
        expectedResult = "$insertNumber\r\nЭто не число\r\n"
        stringInput = ""
        assertNumberPrinter(expectedResult, stringInput)
    }

    @Test
    fun testDouble() {
        expectedResult = "$insertNumber\r\nЭто не число\r\n"
        stringInput = 2.5.toString()
        assertNumberPrinter(expectedResult, stringInput)
    }

    private fun assertNumberPrinter(expectedResult: String, stringInput: String) {
        provideInput(stringInput)
        setUpOutput()
        numberMirror.printMirror()
        TestCase.assertEquals("printMirror print wrong reverse", expectedResult, getOutput())
    }
}