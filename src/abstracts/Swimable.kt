package abstracts

interface Swimable {
    val age: Int
        get() = 1 //Default (오버라이드 가능)

    fun act(){
        println("${age}: Swim")
    }
}