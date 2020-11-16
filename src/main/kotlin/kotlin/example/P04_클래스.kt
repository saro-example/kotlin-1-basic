package kotlin.example

class Class1Basic(
    private val name: String = "String",
    private val type: String = "문자열"
) {
    // 내부의 상수
    private val data1 = "DATA"

    // 내부의 변수
    private var data2 = "DATA"

    // 함수
    fun out() = println("$name: $type")
}

fun main() = listOf(
    // new 가 없다
    Class1Basic("Integer", "정수"),
    // 생략시 기본값이 들어간다.
    Class1Basic(),
    // 값을 지정가능하다.
    Class1Basic(type = "사용자지정")
).forEach { it.out() }

