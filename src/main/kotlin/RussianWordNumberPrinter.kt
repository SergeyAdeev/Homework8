class RussianWordNumberPrinter {

    private val listUnits = arrayListOf(
        "", "один", "два", "три",
        "четыре", "пять", "шесть", "семь", "восемь", "девять"
    )

    private val listTens = arrayListOf(
        "десять", "одиннадцать", "двенадцать", "тринадцать",
        "четырнадцать", "пятнадцать", "шестнадцать",
        "семнадцать", "восемнадцать", "девятнадцать"
    )

    private val listDozens = arrayListOf(
        "", "", "двадцать", "тридцать", "сорок",
        "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"
    )

    private val listHundreds = arrayListOf(
        "", "сто", "двести", "триста", "четыреста",
        "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"

    )

    fun printWords(number: Int): String {
        return try {
            isCorrectNumber(number)
            if (!isThousand(number))
                buildString(number)
            else "тысяча"
        } catch (e: IllegalArgumentException) {
            "Число за границами"
        }
    }

    private fun isThousand(number: Int): Boolean {
        return number / 1000 == 1
    }

    private fun isCorrectNumber(number: Int) {
        require(number in 1..1000) { "Число за границами" }
    }

    private fun buildString(number: Int): String {
        var words: String
        words = listHundreds[number / 100]
        if (number / 10 % 10 == 1) {
            words = "$words ${listTens[number % 10]}"
        } else {
            words = "$words ${listDozens[number / 10 % 10]}"
            words = "${words.trim()} ${listUnits[number % 10]}"
        }
        return words.trim()
    }
}