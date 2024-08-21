fun main(){
    //  Kotlin의 Label (= 사용 추천X, 코드 흐름의 복잡성 증가 가능성이 높음)
    myLabel@ for (i in 1..10){
        println("첫번째 for: ${i}")

        for(j in 100..110){
            println("\t 두번째 for: ${j}")
            if(i==1 && j==105) break //두번째 for문 break
            if(i==2 && j==105) break@myLabel //첫번째 for문까지 break
        }
    }
    println("---")

    printPerson(PersonKotlin("Hong", 50))
    val myPerson = PersonKotlin("Hong", 500).let {
        it.name = "Hong2"
        it.age = 1
        it
    }
    printPerson(myPerson)
    println("---")


}

/**
 * Scope Function (일시적인 영역을 생성)
 * [IT],     [THIS] -> 참조 방법
 * let,      run -> 람다의 결과를 반환
 * also,     apply -> 객체 자기자신 반환
 * with[확장함수 X]
 * */
fun printPerson(person: PersonKotlin?){
    if(person != null){
        println("Name: ${person.name} \t Age: ${person.age}")
    }

    //using let
    person?.let { println("Name: ${it.name} \t Age: ${it.age}")}

    //using with
    with(person){
        println("Name: ${this?.name} \t Age: ${this?.age}")
    }
}