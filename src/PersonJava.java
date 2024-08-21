import org.jetbrains.annotations.Nullable;

public class PersonJava {
    private final String name;
    private int age;
    public PersonJava(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Nullable
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
