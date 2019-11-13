class NumberPrinter {
    fun printNumber() {
        val number = readNumber()
        if (number != null) println("Вы ввели число: $number")
        else println("Это не целое число")
    }

    private fun readNumber(): Int? {
        println("Введите целое число: ")
        return readLine()?.toIntOrNull()
    }
}