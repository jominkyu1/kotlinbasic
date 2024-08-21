fun main() {
    var number1: Long = 10L //variable
    val number2 = 1000L //read only (final)

    number1 = 20L
    //number2 = 30L 할당불가 (final)

    val number3: Long = 30L
    println(number3)

    //Kotlin은 Primitive Type, Reference Type 구분 X (Kotlin 내부적으로 적절히 처리)
    // Alt+Shift+\ inline code completion

    //객체 인스턴스화시 new 사용X
    var person = Person("Hong")
    println("Your name is ${person.name}")
    println(person.toString())
}

class Person(val name: String) {
}