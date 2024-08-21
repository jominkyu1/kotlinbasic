fun main(){
    var str: String? = "ABC"
    println(str?.length)

    str = null
    println(str?.length ?: 0) //Elvis 연산자 (NULL 치환)
    //Elvis인 이유? ?:를 오른쪽으로 90도 꺾으면 엘비스의 헤어스타일과 비슷해서..

    // val result = startsWithA(null);
    // println(result) //IllegalArgumentException 발생

    val result2 = startsWithA2(null)
    println(result2)

    // !! 연산자를 사용하였으나 NULL이 들어오면 NPE
    //println(startsWithA5(null))

    val personJava = PersonJava("Hong", 20);
    // startsWithB(personJava.name) // @Nullable 어노테이션이 존재하므로 컴파일 오류
    // @Nullable 어노테이션이 없으면 플랫폼 타입으로 간주, 정상적으로 컴파일되나 런타임시에 NPE 발생 가능성 존재
}

//Elvis 연산자 사용
fun startsWithA(str: String?): Boolean{
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("NULL")
}

//str NULL일경우 NULL을 그대로 반환
fun startsWithA2(str: String?): Boolean?{
    return str?.startsWith("A")
}

//Elvis 연산자 사용
fun startsWithA3(str: String?): Boolean{
    return str?.startsWith("A") ?: false
}

//Elvis 연산자 사용
fun startsWithA4(str: String?): Boolean{
    //IF문 없이 Early Return 가능
    str ?: return false
    
    return str.startsWith("A")
}

//!! 연산자
fun startsWithA5(str: String?): Boolean{
    //절대 NULL이 아님을 명시적으로 단언 (NULL이 아님이 확실한 경우에만)
    return str!!.startsWith("A")
}

fun startsWithB(str: String): Boolean{
    return str.startsWith("B")
}