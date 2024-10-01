class Animal {
    public void move() {
        System.out.println("ANIMAL MOVES.");
    }
}
class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird flies.");
    }
}
class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("Fish swims.");
    }
}
public class AnimalDemo {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[4];
        //add two Bird() objects to animals and two Fish objects to animals.
        animals[0] = new Bird();
        animals[1] = new Bird();
        animals[2] = new Fish();
        animals[3] = new Fish();
        // Iterate over the array and call move method
        for (Animal animal : animals) {
            animal.move();
        }
    }
}

