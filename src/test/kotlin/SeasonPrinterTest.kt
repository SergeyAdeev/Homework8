import junit.framework.TestCase
import org.junit.jupiter.api.Test

class SeasonPrinterTest : InOutInstaller() {
    private val insertMonth = "Введите номер месяца: "
    private val seasonPrinter = SeasonPrinter()

    private val winter = "Зима"
    private val autumn = "Осень"
    private val summer = "Лето"
    private val spring = "Весна"

    @Test
    fun testWinterDecember() {
        expectedResult = "$insertMonth\r\n$winter\r\n"
        stringInput = 12.toString()
        assertSeasonPrinter(expectedResult, stringInput)
    }

    @Test
    fun testWinterJanuary() {
        expectedResult = "$insertMonth\r\n$winter\r\n"
        stringInput = 1.toString()
        assertSeasonPrinter(expectedResult, stringInput)
    }

    @Test
    fun testSpring() {
        expectedResult = "$insertMonth\r\n$spring\r\n"
        stringInput = 5.toString()
        assertSeasonPrinter(expectedResult, stringInput)
    }

    @Test
    fun testSummer() {
        expectedResult = "$insertMonth\r\n$summer\r\n"
        stringInput = 6.toString()
        assertSeasonPrinter(expectedResult, stringInput)
    }

    @Test
    fun testAutumn() {
        expectedResult = "$insertMonth\r\n$autumn\r\n"
        stringInput = 11.toString()
        assertSeasonPrinter(expectedResult, stringInput)
    }

    @Test
    fun testNullMonth() {
        expectedResult = "$insertMonth\r\nТакого месяца нет\r\n"
        stringInput = 0.toString()
        assertSeasonPrinter(expectedResult, stringInput)
    }

    @Test
    fun testThirteenMonth() {
        expectedResult = "$insertMonth\r\nТакого месяца нет\r\n"
        stringInput = 13.toString()
        assertSeasonPrinter(expectedResult, stringInput)
    }

    @Test
    fun testString() {
        expectedResult = "$insertMonth\r\nТакого месяца нет\r\n"
        stringInput = "Май"
        assertSeasonPrinter(expectedResult, stringInput)
    }

    @Test
    fun testNullString() {
        expectedResult = "$insertMonth\r\nТакого месяца нет\r\n"
        stringInput = ""
        assertSeasonPrinter(expectedResult, stringInput)
    }

    private fun assertSeasonPrinter(expectedResult: String, stringInput: String) {
        provideInput(stringInput)
        setUpOutput()
        seasonPrinter.printSeason()
        TestCase.assertEquals("printSeason print wrong month", expectedResult, getOutput())
    }
}