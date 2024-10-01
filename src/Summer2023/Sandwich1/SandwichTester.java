package Sandwich1;

public class SandwichTester {
    public static void main(String[] args) {
        Sandwich[] sandwiches = new Sandwich[2];
        sandwiches[0] = new HamAndCheese();
        sandwiches[1] = new BLT();

        for(Sandwich sandwich : sandwiches) {
            sandwich.display();
        }
    }
}
