package k.step3

import java.util.stream.Stream
import kotlin.streams.toList

fun main() {
    val list = listOf(1, 2, 3)
    val stream = Stream.of(1, 2, 3)

    println("== 리스트 ==")
    list
            .map { println("1회전 $it"); it }
            .map { println("2회전 $it"); it }

    println("== 스트림 ==")
    stream
            .map { println("1회전 $it"); it }
            .map { println("2회전 $it"); it }
            .toList()
}



