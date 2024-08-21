import abstracts.Flyable

fun main(){
    val result = 5 gopsem 2
    println(result)

    PersonKt.FactoryCompObject.act()

}

infix fun Int.gopsem(numb: Int): Int {
    return this*numb
}


class Car (
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set
}

//Java의 Static표현
class PersonKt private constructor(
    var name: String,
    var age: Int,
){
    var memberInstance: String

    init {
        memberInstance = "LateInit"
    }

    // = Java Static (diff. 객체로 취급)
    // 이름 생략시 default name = Companion
    companion object FactoryCompObject : Flyable{
        //const를 붙일 시 컴파일시 변수가 할당됨. (기본타입과 String에만 붙일 수 있음)
        private const val MIN_AGE = 1
        //JvmStatic어노테이션 -> 자바에서 static접근 가능 ex) PersonKt.newBaby("A")
        @JvmStatic
        fun newBaby(name: String) = PersonKt(name, MIN_AGE)

        override fun act() = println("act overrided")
    }
}