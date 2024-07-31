import java.util.Objects;

public class Person {
    String name;
    String age;

    public Person(String name, String age) {
        Objects.nonNull("name cannot be null");
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("null", "25");
        System.out.println(person);
    }
}
