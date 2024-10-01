package TXTBK_CH1;

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person("Mathews Binny", 23, "Black");
        System.out.println(person1);
        System.out.println();

        person1.setName("Howard Roark");
        System.out.println(person1.talk());


    }
}
