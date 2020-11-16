package k.step4

fun main() {

    var text = "가나다"

    if (text == "가나다") {
        println("text는 가나다이다.")
    } else {
        println("기타")
    }

    text = if (text == "가나다") {
        "text는 가나다이다."
    } else {
        "기타"
    }
    println(text)

}

