package it.kata

class FizzBuzz (private val mapper: Collection<NumberToWord>) {

    fun convert(elementToConvert: Int): String {

        var output: String = ""

        for (element in mapper) {
            output += element.getWordOrEmpty(elementToConvert)
        }

        return if (output.isEmpty()) elementToConvert.toString() else output
    }

}

class NumberToWord(private val word: String, private val condition: (Int) -> Boolean) {
    fun getWordOrEmpty(number: Int) : String =
        if (condition(number)) word else ""
}
