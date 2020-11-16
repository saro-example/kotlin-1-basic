package kotlin.example

fun main() {
    fun1 { text -> println(text) }
    fun1 { println(it) }

    listOf(1, 2, 3, 4).forEach {
        if (it > 2) {
            return@main
        }
        println(it)
    }
}

fun fun1(fun2: (text: String) -> Unit) {
    fun2("고차함수 호출")
}

