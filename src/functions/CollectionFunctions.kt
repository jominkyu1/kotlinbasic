package functions

import com.sun.jdi.IntegerValue

data class KFruit(
    val id: Int,
    val name: String,
    val price: Int,
)

fun main(){
    val fruits = listOf(
        KFruit(1,"사과", 1000),
        KFruit(2,"사과", 1500),
        KFruit(3,"사과", 2000),
        KFruit(4,"사과", 3000),
        KFruit(5,"바나나", 1000),
        KFruit(6,"바나나", 2000),
        KFruit(7,"바나나", 3000),
        KFruit(8,"수박", 10000),
    )

    for((key, value) in filterFruitsGroupByName(fruits)){
        println("Group Key: ${key}")
        value.forEach { println("\t\t ${it}")}
        println()
    }

    println("---")
    filterFruitsAveragePrice(fruits).forEach{
        println("Group Key: ${it.key}  Avg Value: ${it.value}")
    }

    val resultss = fruits.map { it.id to it.name }.toMap()
}

//Collection Filter
private fun filterFruits(
    fruits: List<KFruit>): List<KFruit>{
    return fruits.filter { it.name == "바나나" }
}

private fun filterFruitsGroupByName(
    fruits: List<KFruit>): Map<String, List<KFruit>>{
    return fruits.groupBy { it.name }
                 .toMap()
}

private fun filterFruitsAveragePrice(
    fruits: List<KFruit>): Map<String, Int> {

     return fruits.groupBy { it.name }
                  .mapValues {      //KEY, VALUE모두 접근가능하나 결과값은 VALUE에만 반영됨
                        val priceList = it.value.map { it.price }
                        var total: Int = 0
                        priceList.forEach { price -> total += price }

                        total / priceList.size
                  }
                  .toSortedMap()
}

