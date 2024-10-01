package TXTBK_CH1;

public class Person {
    private String name;
    private int age;
    private String eyeColor;

    public Person() {
        name = "null";
        age = 0;
        eyeColor = "null";
    }

    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        String result = " - Person Details -\n" + "Name: " + getName() + "\nAge: " + getAge() + "\nEye Color: " + getEyeColor();
        return result;
    }

    public String talk() {
        return "Welcome, coders! I am " + getName();

    }
}
