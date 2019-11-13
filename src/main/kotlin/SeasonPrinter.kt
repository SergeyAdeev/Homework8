class SeasonPrinter {
    private val winter = "Зима"
    private val autumn = "Осень"
    private val summer = "Лето"
    private val spring = "Весна"

    private fun readMonth(): Int? {
        println("Введите номер месяца: ")
        return readLine()?.toIntOrNull()
    }

    fun printSeason() {
        when (readMonth()) {
            1, 2, 12 -> println(winter)
            3, 4, 5 -> println(spring)
            6, 7, 8 -> println(summer)
            9, 10, 11 -> println(autumn)
            else -> println("Такого месяца нет")
        }
    }
}