package k.step4

fun main() {
    println()
    for (i in 0..3) {
        println("i in 0..3 : $i")
    }

    println()
    for (i in 0 until 3) {
        println("i in 0 until 3 : $i")
    }

    println()
    for (i in 3 downTo 0) {
        println("i in 3 downTo 0 : $i")
    }

    println()
    (1 until 3).forEach {
        println("(1 until 3).forEach : $it")
    }

    println()
    (2..9).map { dan ->
        (1..9).forEach { no -> println("$dan x $no = ${dan * no}") }
    }
}