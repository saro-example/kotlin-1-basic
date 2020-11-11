package k.step1

open class Class2JavaParent {
    fun hi() = "HELLO"
}

interface Class2JavaInterface {
    fun out()
}

// extend 는 클래스(), implement 는 클래스 형태로 상속한다.
class Class2Java : Class2JavaParent(), Class2JavaInterface {
    override fun out() = println(hi())
}

fun main() = Class2Java().out()


