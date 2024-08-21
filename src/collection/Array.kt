package collection

import PersonKotlin

fun main(){
    val array = arrayOf(100, 200, 300, 400, 500, 500)
    array.plus(600)

    //array의 각 요소 반환
    for(i in array){
        println("Value $i")
    }
    println("----")

    //indices -> Index IntRange형 반환
    for(i in array.indices){
        println("Index $i -> ${array[i]}")
    }
    println("----")

    //index와 value 한번에
    for((idx, value) in array.withIndex()){
        println("Index $idx Value $value")
    }
    println("----")

    val (name, age) = PersonKotlin("Hong", 20)
    println(name +"__"+ age)
}