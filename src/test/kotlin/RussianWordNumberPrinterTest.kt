import org.junit.Assert.assertEquals
import org.junit.Test

class RussianWordNumberPrinterTest {
    private val russianWordNumberPrinter = RussianWordNumberPrinter()
    private val message = "wordPrinter returns wrong string"

    @Test
    fun testLowerBoundary() {
        assertEquals(message, "один", russianWordNumberPrinter.printWords(1))
    }

    @Test
    fun testHigherBoundary() {
        assertEquals(message, "тысяча", russianWordNumberPrinter.printWords(1000))
    }

    @Test
    fun testOutOfLowerBoundary() {
        assertEquals(message, "Число за границами", russianWordNumberPrinter.printWords(0))
    }

    @Test
    fun testOutOFHigherBoundary() {
        assertEquals(message, "Число за границами", russianWordNumberPrinter.printWords(1001))
    }

    @Test
    fun testDoubleDigit() {
        assertEquals(message, "двадцать", russianWordNumberPrinter.printWords(20))
    }

    @Test
    fun testThreeDigit234() {
        assertEquals(message, "двести тридцать четыре", russianWordNumberPrinter.printWords(234))
    }

    @Test
    fun testThreeDigit345() {
        assertEquals(message, "триста сорок пять", russianWordNumberPrinter.printWords(345))
    }

    @Test
    fun testThreeDigit456() {
        assertEquals(message, "четыреста пятьдесят шесть", russianWordNumberPrinter.printWords(456))
    }

    @Test
    fun testThreeDigit567() {
        assertEquals(message, "пятьсот шестьдесят семь", russianWordNumberPrinter.printWords(567))
    }

    @Test
    fun testThreeDigit678() {
        assertEquals(message, "шестьсот семьдесят восемь", russianWordNumberPrinter.printWords(678))
    }

    @Test
    fun testThreeDigit789() {
        assertEquals(message, "семьсот восемьдесят девять", russianWordNumberPrinter.printWords(789))
    }

    @Test
    fun testThreeDigit892() {
        assertEquals(message, "восемьсот девяносто два", russianWordNumberPrinter.printWords(892))
    }

    @Test
    fun testThreeDigit903() {
        assertEquals(message, "девятьсот три", russianWordNumberPrinter.printWords(903))
    }

    @Test
    fun testThreeDigit111() {
        assertEquals(message, "сто одиннадцать", russianWordNumberPrinter.printWords(111))
    }

    @Test
    fun testTen() {
        assertEquals(message, "десять", russianWordNumberPrinter.printWords(10))
    }

    @Test
    fun testTwelve() {
        assertEquals(message, "двенадцать", russianWordNumberPrinter.printWords(12))
    }

    @Test
    fun testThirteen() {
        assertEquals(message, "тринадцать", russianWordNumberPrinter.printWords(13))
    }

    @Test
    fun testFourteen() {
        assertEquals(message, "четырнадцать", russianWordNumberPrinter.printWords(14))
    }

    @Test
    fun testFifteen() {
        assertEquals(message, "пятнадцать", russianWordNumberPrinter.printWords(15))
    }

    @Test
    fun testSixteen() {
        assertEquals(message, "шестнадцать", russianWordNumberPrinter.printWords(16))
    }

    @Test
    fun testSeventeen() {
        assertEquals(message, "семнадцать", russianWordNumberPrinter.printWords(17))
    }

    @Test
    fun testEighteen() {
        assertEquals(message, "восемнадцать", russianWordNumberPrinter.printWords(18))
    }

    @Test
    fun testNineteen() {
        assertEquals(message, "девятнадцать", russianWordNumberPrinter.printWords(19))
    }
}