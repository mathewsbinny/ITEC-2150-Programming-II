package Sandwich2;

import java.sql.SQLOutput;

public class OrderForm {
    private Sandwich sandwich;
    private int quantity;

    public OrderForm(Sandwich sandwich, int quantity) {
        this.sandwich = sandwich;
        this.quantity = quantity;
    }

    public double calculate() {
        double finalPrice = quantity * sandwich.price;
        return finalPrice;
    }

    public void display() {
        System.out.println("Sandwich: " + sandwich.name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + sandwich.price);
        System.out.println("Subtotal Price: " + calculate());
    }
}
