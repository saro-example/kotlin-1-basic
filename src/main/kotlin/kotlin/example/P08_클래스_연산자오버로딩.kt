package kotlin.example

data class Class4(
    var value: String = "스트링"
) {
    operator fun plus(text: String) =
        Class4("$value 문자더해짐 $text")

    operator fun plus(cl4: Class4) =
        Class4("$value 객체더해짐 ${cl4.value}")
}

fun main() {
    val cl4 = Class4();

    println(cl4 + "스트링")
    println(cl4 + Class4("객체"))
}














