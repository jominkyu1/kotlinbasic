/**
 * 코틀린에서는 선언된 기본값을 보고 타입을 추론 (타입 변환은 명시적으로)
 * */
fun main(){
    val number1 = 10
    val number2: Long = number1.toLong() - 7L // 명시적인 타입 변환

    val divided = number1 / number2
    val dividedDouble = number1.toDouble() / number2

    println("Divided Long : ${divided}")
    println("Divided Double : ${dividedDouble}")
    
    //Nullable 처리
    val number1Nullable: Int? = 3
    val number2Nullable: Long = number1Nullable?.toLong() ?: 0L

    //String
    val query: String =
        """
            SELECT BLAH BLAH
            FROM BLAH BLAH
        """.trimIndent()

    println("YOUR QUERY : ${query}")

}

//Java Object = Kotlin Any
//Kotlin에서는 Primitive Type의 최상위 타입도 Any
fun typeCasting(obj: Any){
    // is not -> !is
    if(obj is PersonJava){ // Java의 instanceof
        // TypeCasting 생략가능, 일반적으로 명시적으로 형변환을 해야하나 is키워드로 체크했기때문에 컴파일러가 스마트캐스팅해줌
        val personJava = obj as PersonJava
        println(personJava.name)
    }
}

//Nullable Parameter
fun typeCasting2(obj: Any?){
    //캐스팅 실패시 ClassCastException이 나야하지만 as? 키워드사용시 null할당
    val personJava = obj as? PersonJava
    println(personJava?.name)
}