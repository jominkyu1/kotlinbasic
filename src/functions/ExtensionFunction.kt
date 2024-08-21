package functions
//  확장 함수
//  확장 함수에서는 Private, Protected 멤버 접근 불가능
//  확장함수 시그니처 = 멤버함수 시그니처 -> 멤버함수 호출
//  확장함수는 현재 타입을 기준으로 호출됨
//  Kotlin -> JAVA에서 호출시 static 호출처럼 사용
fun main(){
    val lastChar = "ABC".lastChar()
    println(lastChar)
}

// "ABC".lastChar()에서 "ABC" = this(수신 객체)
fun String.lastChar(): Char{
    return this[this.lastIndex]
}