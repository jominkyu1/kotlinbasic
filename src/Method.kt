import com.sun.tools.javac.util.StringUtils

fun main(){
    println(max(10, 10))
    println(max(10, 15))

    println("--------")
    repeat("Hello", makeNewLine = false) //Named Arguments를 사용하여 파라미터 순서에 관계없이 파라미터 전달가능
    //Builder패턴을 사용하지않고 Builder의 장점을 가지게됨 (JAVA 함수를 가져다 쓸 경우 사용 불가능)

    println("--------")
    printAll("A", "B", "C") //가변인자

    val array = mutableListOf("A", "B", "C")
    array.add("D")
    printAll(*array.toTypedArray()) //  * -> spread연산자 (원소들을 개별 인자로 전달, 주로 vararg 인자로 보낼때 사용) array[0], array[1], array[2] ... 와 같은 형태로 컴파일러가 변환

}

//반환타입 또한 생략가능 (추론이 가능하므로)
fun max(a: Int, b: Int) = if(a==b) -1 else if(a > b) a else b

//Default Parameter
fun repeat(str: String,
           times: Int = 3,
           makeNewLine: Boolean = true) {
    for(i in 1..times) {
        if(makeNewLine){
            println(str)
        } else {
            print(str)
        }
    }
}

//가변 인자
fun printAll(vararg strings: String){
    for(string in strings){
        println(string)
    }
}
