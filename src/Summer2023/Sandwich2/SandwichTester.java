package Sandwich2;
import java.util.ArrayList;

public class SandwichTester {
    public static void main(String[] args) {
        ArrayList<OrderForm> orders = new ArrayList<>();

        orders.add(new OrderForm(new SpicyChicken(), 3));
        orders.add(new OrderForm(new SteakBurger(), 2));

        double totalPrice = 0;
        for(OrderForm order: orders) {
            totalPrice += order.calculate();
            order.display();
            System.out.println();
        }

        System.out.println("Total Price: " + totalPrice);
    }
}


/**
 * Extra Credit: Modify program where ingredients you add also are integrated into price
 */