//함수의 인자로 익명 클래스(인터페이스, 추상클래스 구현체) 전달시 object 키워드 사용
fun main(){
    moveSomething(object : Movable {
        override fun move() {
            println("MOVE")
        }

        override fun fly() {
            println("FLY")
        }
    })
}

interface Movable{
    fun move()
    fun fly()
}

private fun moveSomething(m: Movable){
    m.move()
    m.fly()
}