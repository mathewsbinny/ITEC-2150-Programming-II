package Sandwich2;

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

    /**
     * getters and setters
     * @return
     */
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}