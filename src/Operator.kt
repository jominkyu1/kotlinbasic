//연산자는 기본적으로 동일
//단, Kotlin에서는 객체의 비교 연산자( >, <, >=, <=) 사용시 compareTo를 자동으로 호출해줌
fun main(){
    val money1 = MoneyJava(5_000L)
    val money2 = money1

    val money3 = MoneyJava(10_000L)
    val money4 = MoneyJava(10_000L)

    //compareTo 자동호출
    if(money1 > money3) println("MONEY1이 더 큼")
    else println("MONEY3가 더 크거나 같음")

    //Kotlin에서 동일성(참조 주소가 같은지) 비교시 === 사용, == 사용시 equals호출 (동등성: 값이 같은지)
    println(money1 === money2) // TRUE, 자바 ==와 동일

    println(money3 === money4) // FALSE
    println(money3 == money4) // TRUE, equals() 호출

    // in / !in
    // 컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다
    val numbers = listOf(1,2,3,4,5)
    // or val numbers = 1..5
    println(1 in numbers) // TRUE
}