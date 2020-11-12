package k.step2

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


val UTF8 = Charsets.UTF_8

fun ymd(): String =
    LocalDateTime.now()
        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))

// 아래와 같이 기존 클래스에 확장 가능하다.
fun String.has(text: String) = this.indexOf(text) != -1

fun main() {
    println(UTF8)
    println(ymd())
    println("코틀린 예제 입니다.".has("예제"))

}
