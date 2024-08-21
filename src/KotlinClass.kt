fun main(){
    //Kotlin Class
    val person = PersonKotlin("Hong", 50)
    println(person.name) // Property Getter
    person.age = 100 //Property Setter
    println(person.age)

    val person2 = PersonKotlin("Hong2")
    println(person2.age)
}