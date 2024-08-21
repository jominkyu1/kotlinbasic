public class TestJava {
    public static void main(String[] args) {
        //코틀린 코드에 @JvmStatic이 없다면
        PersonKt.FactoryCompObject.act();
        
        //코틀린 코드에 @JvmStatic이 있다면
        //PersonKt.act();
    }
}
