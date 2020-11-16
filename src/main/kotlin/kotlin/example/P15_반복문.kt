package kotlin.example

fun main() {

    println("(do) while 은 기존과 동일")
    var i = 0
    while (++i < 3) {
        println("while (++i < 3) : $i")
    }

    println("새로운 표기 0..3")
    val list = 0..3
    list.forEach { println(it) }

    println("** 0 <= 3")
    for (i in 0..3) {
        println("i in 0..3 : $i")
    }

    println("** 0 < 3")
    for (i in 0 until 3) {
        println("i in 0 until 3 : $i")
    }

    println("** 3 >= 0")
    for (i in 3 downTo 0) {
        println("i in 3 downTo 0 : $i")
    }

    println("** 1 < 3")
    (1 until 3).forEach {
        println("(1 until 3).forEach : $it")
    }

    println("** 구구단")
    (2..9).map { dan ->
        (1..9).forEach { no -> println("$dan x $no = ${dan * no}") }
    }
}
