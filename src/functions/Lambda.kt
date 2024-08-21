package functions
// Kotlin에서는 함수가 1급 시민이다. (JAVA에서는 2급 시민)

data class Fruit(
    val name: String,
    val price: Int,
)

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1500),
        Fruit("사과", 2000),
        Fruit("사과", 3000),
        Fruit("바나나", 1000),
        Fruit("바나나", 2000),
        Fruit("바나나", 3000),
        Fruit("수박", 10000),
        )

    //매개변수 Fruit을 받아 Boolean Return
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2 = {fruit:Fruit -> fruit.name == "사과"}


    //함수객체를 함수처럼 호출하여도 내부적으로 invoke 호출
    isApple(fruits[0])

    //명시적으로 invoke (함수 객체임을 표시하고 싶을 경우)
    isApple.invoke(fruits[0])


    //매개변수로 함수객체 전달가능
    val filteredFruits = filterFruits(fruits, isApple)
    println("Filtered size1: "+filteredFruits.size)

    var fruitName:String = "망고"
    fruitName = "사과"

    //식(Expression, 람다) 파라미터가 마지막에 있으면 파라미터 밖에서 람다식을 작성해 전달가능
    val filteredFruits2 = filterFruits(fruits) {
        it.name == "망고"
        it.name == "바나나"

        it.name == fruitName
        //여러줄일경우 마지막줄의 결과가 람다의 반환값
        //람다 밖의 변수정보를 호출시점에 미리 가져오기때문에 non-val 객체도 참조가능 (= Closure)
        //Detail -> 해당 변수를 Object로 만든 후 Object의 reference를 각 람다가 공유하는 방식(But, not thread-safe)
        //JAVA에서는 final(혹은 기능적으로 final과 동일한) 외부 변수 참조만 가능
    }

    println("Filtered size2: " + filteredFruits2.size)
}


public fun filterFruits(
    fruits: List<Fruit>,
    //Parameter에 람다식을 명시가능
    filter: (Fruit) -> Boolean,
    ): List<Fruit>{

    val result = mutableListOf<Fruit>()

    fruits.forEach {
        if(filter.invoke(it)) result.add(it)
    }

    return result
}

//Collection Filter
private fun filterFruits2(
    fruits: List<Fruit>,
    lambdaFilter: (Fruit) -> Boolean
): List<Fruit>{
    return fruits.filter(lambdaFilter)
}
