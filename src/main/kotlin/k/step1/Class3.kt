package k.step1

// 롬복의 @Data 와 유사하다.
data class Class3 (
    var name: String = "이름",
    var type: String = "타입"
) {
    val nameAndTypeProps: String get() = "$name: $type"
}

fun main() {
    val clazz = Class3()
    // data class 는 롬복 @Data 와 같은 기본 @ToString 생성
    println(clazz)
    println(clazz.nameAndTypeProps)
}

