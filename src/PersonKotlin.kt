import java.util.*

//default public class

class PersonKotlin (
    name: String, //생성자 정의 (주 생성자)
    var age: Int){
    //프로퍼티 Getter Setter Auto Generated

    //name 프로퍼티의 Custom Getter, Setter (backing field 사용 빈도 낮음, 따로 Method를 정의)
    var name:String = name
        get() = field.uppercase() //field 예약어(backing field)가 아닌 name사용시 getter 무한 재귀호출 발생
        set(value) {
            field = value.uppercase()
        }

    //혹은 다른 Property처럼 정의하여 사용
    val uppercaseName: String
        get() = name.uppercase()
    
    //Custom Setter대신 Method정의
    fun updateName(str: String){
        this.name = str.uppercase()
    }

    //data class로 정의하면 componentN 자동 생성
    operator fun component1(): String {
        return this.name
    }
    operator fun component2(): Int {
        return this.age
    }

    //클래스 초기화 시점에 호출되는 초기화 블록 (가장 먼저 호출됨)
    init {
       if (age < 0){
           throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
       }
    }
    constructor(name: String): this(name, 1) //부 생성자 (사용빈도 낮음) (주 생성자 코드에 Default parameter로도 가능 (var age: Int = 10))

    //Custom Getter
    val isAdult: Boolean
        get() = age >= 20
}
