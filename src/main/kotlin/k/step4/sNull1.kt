package k.step4

import java.lang.Exception
import java.lang.NullPointerException

fun main() {

    val text1: String? = null
    // ?: 엘비스 연산을 이용하면
    // null 일경우 오른쪽으로 대처한다.
    val text2 = text1 ?: ""

    text1 ?: throw NullPointerException(
            "?: 엘비스 연산자를 이용하여 바로 throw 할 수 있다."
    )
    text1 ?: return // 바로 리턴도 가능하다.

}
