package kotlin.example

fun main() {
    val cl1: Class1? = null
    val cl2: Class1? = Class1("이름")

    // 기존 자바스타일
    // println(cl1 != null && cl1.name != null ? cl1.name : null)
    // println(cl1 != null && cl1.name != null ? cl1.name : "이름없음")

    // 코틀린 스타일
    println(cl1?.name)
    println(cl1?.name ?: "이름없음")
    println(cl2?.name)
}

data class Class1 (var name: String? = null)

