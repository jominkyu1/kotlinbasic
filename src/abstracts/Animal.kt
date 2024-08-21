package abstracts

abstract class Animal (
    val species: String,
    open var legCount: Int){ //open -> Property override 가능하게 만듦

    abstract fun move()
}