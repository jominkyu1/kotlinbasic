package abstracts

class Cat(
    species: String
) : Animal(species, 4) // 부모 생성자 호출
{
    override fun move() {
        println("CAT Moves")
    }
}