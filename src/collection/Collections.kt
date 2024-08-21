package collection

// 가변컬렉션은 Mutable...로 정의 되어있음
fun main(){
    //List (Set(중복 미허용)과 사용방법 동일)
    println("---LIST---")
    val numbers = listOf(100, 200) //불변
    val mutableNumbers = mutableListOf(100, 200) //가변
    mutableNumbers.add(300)
    val emptyNumbers = emptyList<Int>() //Type지정, 추론시 생략가능

    println(numbers[0]) // 대괄호 접근가능

    for((idx, value) in numbers.withIndex()){
        println("Index ${idx} Value ${value}")
    }

    //Map
    println("---MAP---")
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "First Element"
    oldMap[2] = "Second Element"
    oldMap.put(3, "Third Element")

    //초기화시 중위호출 to 사용가능
    val newMap = mapOf(3 to "Three", 4 to "Four")

    for (key in oldMap.keys){
        println("Key: ${key} - Value ${oldMap[key]}")
    }
    
    //Key Value 쌍 (entires 생략가능)
    for ((key, value) in newMap.entries){
        println("Key: ${key} - Value ${value}")
    }

    // Collection Nullable
    // List<Int?>   리스트 NOT NULL    밸류 NULL
    // List<Int>?   리스트 NULL        밸류 NOT NULL
    // List<Int?>?  리스트 NULL        밸류 NULL
    // Kotlin의 Collection이 JAVA에서 사용되면 컬렉션 요소가 추가되거나 삭제되는 등 변동이 일어날 수 있음에 유의
}
