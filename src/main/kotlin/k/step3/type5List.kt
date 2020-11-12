package k.step3

fun main() {
    val list = listOf("1", "2", "3")

    println(list)
    println(list.map { "${it}값" })
    println("3" in list)
    println("4" in list)
}