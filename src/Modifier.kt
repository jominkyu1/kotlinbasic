/**
 * 코틀린에서는 package를 접근제어의 개념으로 사용하지 않음
 * protected -> [선언된 클래스] 또는 하위 클래스에서만 접근가능 (JAVA에서 같은 패키지가 빠짐)
 * default -> 삭제됨 (기본 접근제어자 Public)
 * internal -> 같은 모듈에서만 접근 가능, 일반적으로 하나의 Gradle Project, Maven 프로젝트 등 (C# internal과 비슷)
 * */
fun main(){
    val dog = Dog("Happy")
    println("First NameLength: ${dog.nameLength}")

    //nameLength는 여전히 5, (val by lazy)
    dog.name = "HappyTogether"
    println("Second nameLength: ${dog.nameLength}")

}

class Dog private constructor() {
    lateinit var name: String
    val nameLength: Int by lazy { //호출될 때 초기화
        name.length
    }

    init {
        println("INIT 블록")
    }

    constructor(name: String) : this() {
        println("생성자 블록")
        this.name=name
    }
}