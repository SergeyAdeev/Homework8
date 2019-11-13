import org.junit.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals

class ArrayRewriterTest {

    private val arrayRewriter = ArrayRewriter()

    @Test
    fun testPositiveAndNegative() {
        val testArray = arrayOf(1, 6, -8, 2)
        assertArrayEquals(arrayOf(-8, 2, 6, 1), arrayRewriter.rewriteArray(testArray))
    }

    @Test
    fun testEmpty() {
        val testArray = arrayOf<Int>()
        assertArrayEquals(arrayOf<Int>(), arrayRewriter.rewriteArray(testArray))
    }

    @Test
    fun testAllPositive() {
        val testArray = arrayOf(1, 5, 2, 6, 3)
        assertArrayEquals(arrayOf(3, 6, 2, 5, 1), arrayRewriter.rewriteArray(testArray))
    }

    @Test
    fun testAllNegative() {
        val testArray = arrayOf(-1, -3, -4, -2, -1)
        assertArrayEquals(arrayOf(-1, -3, -4, -2, -1), arrayRewriter.rewriteArray(testArray))
    }

    @Test
    fun testWithZero() {
        val testArray = arrayOf(4, -3, 0, -1)
        assertArrayEquals(arrayOf(-3, -1, 0, 4), arrayRewriter.rewriteArray(testArray))
    }

    @Test
    fun testAllNegativeWithZero() {
        val testArray = arrayOf(0, -3, -4, -1)
        assertArrayEquals(arrayOf(-3, -4, -1, 0), arrayRewriter.rewriteArray(testArray))
    }
}