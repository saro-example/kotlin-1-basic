package k.step3

fun main() {
    var map = mapOf("key1" to "값1", "key2" to "값2", "key3" to "값3")

    println(map.entries.parallelStream().map { e -> e })
    println(map["key1"])
    println(map.get("key1"))
}


