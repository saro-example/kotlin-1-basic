package kotlin.example

fun main() {

    var text = "가나다"

    when (text) {
        "가나다" -> println("text는 가나다이다.")
        "ABC" -> println("text는 ABC이다.")
        else -> println("기타")
    }

    when {
        text == "가나다" -> println("text는 가나다이다.")
        else -> println("기타")
    }

    text = when {
        text == "가나다" -> "$text 는 가나다 이다."
        else -> "기타값"
    }
    println(text)

}
