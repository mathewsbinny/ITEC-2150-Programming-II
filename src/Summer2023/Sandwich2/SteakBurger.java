package Sandwich2;

public class SteakBurger extends Sandwich{
    public SteakBurger() {
        super("Steak Burger", 8.99);
    }
    public void addPatty() {
        System.out.println("Adding Beef Patty");
    }
    public void addLettuce() {
        System.out.println("Adding Lettuce");
    }
    public void addTomato() {
        System.out.println("Adding Tomato");
    }
    public void addOnion() {
        System.out.println("Adding Onion");
    }
    public void addCheese() {
        System.out.println("Adding Cheese");
    }

    public void display() {
        super.display();
        addLettuce();
        addOnion();
        addPatty();
        addCheese();
        addTomato();
    }
}
