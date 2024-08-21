import java.util.*

fun main(){
    (1..3).forEach { print("${it}, ") } // 1, 2, 3
    //SameCode: IntRange(1, 3).step(1).forEach(::println)

    (3 downTo 1).forEach { print("${it}, ") } // 3, 2, 1
    (1..10 step 3).forEach { print("${it}, ") } // 1, 4, 7, 10

}

fun isNegative(score: Int){
    if(score !in 0..100){
        throw IllegalArgumentException("${score} <- 0이상 100이하여야 합니다.")
    }
}

// 코틀린에서는 if-else가 Expression이므로 return 혹은 =(대입) 가능
// (JAVA에서는 Statement 이므로 Return이나 대입이 불가능, 이에 Expression처럼 사용가능한 3항연산자 제공. 코틀린에는 3항연산자 없음)
fun getPassOrFail(score: Int): String{
    return if(score >= 50){
        "P"
    } else {
        "F"
    }
}

// 자바의 Switch -> 코틀린 When
fun getGrade(score: Int): String{
    return when(score){
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean{
    return when(obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

// when 조건이 없어도 사용가능
fun isEvenNumber(number: Int){
    when {
        number == 0 -> println("0 입니다.")
        number % 2 == 0 -> println("짝수")
        else -> println("홀수")
    }
}

fun printList(){
    val numbers = listOf(1, 2, 3)
    numbers.forEach { numb -> println(numb) }
}