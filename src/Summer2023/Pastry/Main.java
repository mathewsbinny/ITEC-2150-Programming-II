package Pastry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ingredient flour = new Ingredient("Flour");
        Ingredient sugar = new Ingredient("Sugar");
        Ingredient butter = new Ingredient("Butter");
        Ingredient eggs = new Ingredient("Eggs");


        Pastry croissant = new Pastry("Croissant");
        croissant.addIngredient(flour);
        croissant.addIngredient(sugar);

        Pastry muffin = new Pastry("Blueberry Muffin");
        muffin.addIngredient(flour);
        muffin.addIngredient(sugar);

        Cake poundcake = new Cake("Pound Cake");
        poundcake.addIngredient(flour);
        poundcake.addIngredient(butter);
        poundcake.addIngredient(eggs);
        poundcake.addIngredient(sugar);

        Bakery bakery = new Bakery();
        bakery.addPastry(croissant);
        bakery.addPastry(muffin);

        bakery.displayPastries();
    }
}
