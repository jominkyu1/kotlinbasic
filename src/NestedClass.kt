//중첩 클래스(내부 클래스 static or not static)
fun main(){
    val house = House("Seoul")
    val houseInner = house.livingRoom

    println(house.address)
    println(houseInner.address)
}

class House (
    var address: String,
){
    var livingRoom = this.LivingRoom(10)
    //inner 키워드가 없으면 default는 static(권장), inner 키워드 붙일 시 권장되지 않는 non static 내부 클래스(외부 참조를 가짐)
    inner class LivingRoom(
        private var area: Int,
    ) {
        val address: String
            //inner class의 외부 클래스 참조방법
            get() = this@House.address
    }
}
