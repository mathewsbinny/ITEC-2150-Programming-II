package Pastry;
import java.util.ArrayList;

public class Pastry {
    private String name;
    private ArrayList<Ingredient> ingredients;

    public Pastry(String name) {
        this.name = name;
        ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void displayIngredients() {
        System.out.println("Ingredients for " + name + ": ");
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getName());
        }
    }

    public String getName() {
        return name;
    }
}
