/**
 * Data Class -> JAVA의 DTO (equals, hashcode, toString, copy 자동 생성)
 * */
fun main(){
    //using Data Class
    val person = PersonDto("Hong", 20)
    val person2 = PersonDto("Hong", 20)

    println(person === person2) // 참조 주소가 다르므로 FALSE
    println(person == person2) // equals 자동 생성 (모든 프로퍼티 비교)
    println(person) // toString 자동생성
    println(person.hashCode()) //hashCode 자동생성
    val copiedPerson = person.copy(name = "HongGilDong") // 일부 프로퍼티만 수정한 복제 객체 생성 (for Thread Safe)

    println("-------")

    //using Enum Class
    handleCountry(Country.AMERICA)
}

fun handleCountry(c: Country) {
    when(c){
        Country.KOREA -> println("$c name, code -> ${c.name}, ${c.code}")
        Country.AMERICA -> println("$c name, code -> ${c.name}, ${c.code}")
    }
}

//JDK 16부터 record class 추가
data class PersonDto(
    val name: String,
    val age: Int,
)

enum class Country(
    val code: String) {

    KOREA("KOR"),
    AMERICA("US"),
}