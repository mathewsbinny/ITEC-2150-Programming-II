package Sandwich1;

public class Sandwich {
    protected String name;
    protected double price;

    /**
     * constructor taking name and price
     */
    public Sandwich(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
