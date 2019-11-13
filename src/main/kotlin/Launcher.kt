fun main() {
    readTaskNumber()
}

private fun readTaskNumber() {
    println("Введите номер задачи:")
    println("1 - Напечатать число")
    println("2 - Число наоборот")
    println("3 - Напечатать время года")
    println("4 - Переписать массив")
    println("5 - Печатать число словами")
    try {
        when (readLine()?.toInt()) {
            1 -> launchNumberPrinter()
            2 -> launchNumberMirror()
            3 -> launchSeasonPrinter()
            4 -> launchArrayRewriter()
            5 -> launchRussianWordNumberPrinter()
            else -> println("Такой задачи нет:(")
        }
    } catch (e: NumberFormatException) {
        println("Такой задачи нет:(")
    }
}

private fun launchArrayRewriter() {
    val arrayRewriter = ArrayRewriter()
    val array = arrayOf(0, -3, 4, -1)
    val arr = arrayRewriter.rewriteArray(array)
    arr.forEach { print(it) }
}

private fun launchNumberMirror() {
    val numberMirror = NumberMirror()
    numberMirror.printMirror()
}

private fun launchNumberPrinter() {
    val numberPrinter = NumberPrinter()
    numberPrinter.printNumber()
}

private fun launchSeasonPrinter() {
    val seasonPrinter = SeasonPrinter()
    seasonPrinter.printSeason()
}

fun launchRussianWordNumberPrinter() {
    val russianWordNumberPrinter = RussianWordNumberPrinter()
    print(russianWordNumberPrinter.printWords(930))
}