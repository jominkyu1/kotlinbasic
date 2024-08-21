package abstracts

//Abstract Class, Interface Class 모두 똑같이 상속, 구현
class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("Penguin moves")
    }

    //Getter Override
    override var legCount: Int = super.legCount + this.wingCount //초기화시점 계산 (최신화 안됨)
    //  get() = super.legCount + this.wingCount //호출시마다 계산 (최신화)
    override val age: Int
        get() = 10

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}