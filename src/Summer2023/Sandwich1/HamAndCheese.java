package Sandwich1;

public class HamAndCheese extends Sandwich {
    public HamAndCheese() {
        super("Ham and Cheese Sandwich", 3.99);
    }

    public void addHam() {
        System.out.println("Adding Ham");
    }

    public void addCheese() {
        System.out.println("Adding Cheese");
    }


    public void display() {
        super.display();
        addHam();
        addCheese();
    }
}