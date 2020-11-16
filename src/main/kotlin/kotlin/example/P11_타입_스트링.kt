package kotlin.example

fun main() {
    // 코틀린에서 == 은 자바의 .equal 과 같다.
    // 코틀린에서 === 은 자바의 == 와 같다.

    var var1 = "테스트 문구"
    var var2 = "테스트 문구"
    var1 += ""

    println("var1 == var2 : ${var1 == var2}")
    println("var1 === var2 : ${var1 === var2}")
}


