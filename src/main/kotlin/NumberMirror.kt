import kotlin.math.abs

class NumberMirror {

    fun printMirror() {
        println("Введите целое трехзначное число: ")
        var number = readNumber()
        if (number != null) {
            try {
                isThreeNumerals(number)
                number = isNegative(number)
                printNumber(number)
            } catch (e: IllegalArgumentException) {
                println("Число должно быть трехзначное")
            }
        } else println("Это не число")
    }

    private fun isNegative(number: Int): Int {
        if (number < 0) print("-")
        return abs(number)
    }

    private fun readNumber(): Int? {
        return readLine()?.toIntOrNull()
    }

    private fun isThreeNumerals(number: Int) {
        require(abs(number) in 100..999) { "Число не трехзначное" }
    }

    private fun printNumber(number: Int) {
        val numerals: Array<String> = number.toString().split("").toTypedArray()
        numerals.reverse()
        numerals.forEach {
            print(it)
        }
    }


}