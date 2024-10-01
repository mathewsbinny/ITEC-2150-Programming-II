package Practice;

// Superclass Animal
class Animal {
    public void move() {
        System.out.println("This animal moves in its own way.");
    }
}


class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird flies in the sky.");
    }
}


class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("Fish swims in water.");
    }
}

// Main class to demonstrate polymorphism
public class AnimalDemo {
    public static void main(String[] args) {

        // Create an array of Animal objects
        Animal[] animals = new Animal[4];
        animals[0] = new Bird();
        animals[1] = new Fish();
        animals[2] = new Bird();
        animals[3] = new Fish();


        for (Animal animal : animals) {
            animal.move();
        }
    }
}
