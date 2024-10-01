package Sandwich1;

public class BLT extends Sandwich {
    public BLT() {
        super("BLT", 4.99);
    }
    public void addBacon() {
        System.out.println("Adding Bacon");
    }
    public void addLettuce() {
        System.out.println("Adding Lettuce");
    }
    public void addTomato() {
        System.out.println("Adding Tomato");
    }
    public void addSauce() {
        System.out.println("Adding Secret Sauce");
    }

    public void display(){
        super.display();
        addBacon();
        addLettuce();
        addTomato();
        addSauce();
    }
}
