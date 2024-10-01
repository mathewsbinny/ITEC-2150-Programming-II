package Sandwich2;

public class SpicyChicken extends Sandwich{
    public SpicyChicken() {
        super("Spicy Sandwich", 4.99);
    }
    public void addLettuce() {
        System.out.println("Adding Lettuce");
    }
    public void addChicken() {
        System.out.println("Adding Chicken");
    }
    public void addSpicySauce() {
        System.out.println("Adding Spicy Sauce");
    }
    public void display() {
        super.display();
        addLettuce();
        addChicken();
        addSpicySauce();
    }
}
