package Pastry;
import java.util.ArrayList;

public class Bakery {
    private ArrayList<Pastry> pastries;

    public Bakery() {
        pastries = new ArrayList<>();
    }

    public void addPastry(Pastry pastry) {
        pastries.add(pastry);
    }

    public void displayPastries() {
        System.out.println("Pastries in the bakery:");
        for (Pastry pastry : pastries) {
            System.out.println("Pastry: " + pastry.getName());
            pastry.displayIngredients();
            System.out.println();
        }

    }
}
