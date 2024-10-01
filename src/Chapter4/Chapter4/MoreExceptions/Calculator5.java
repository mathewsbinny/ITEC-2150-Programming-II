package Ch4Ex1;

/**
 * this program is combining two while loops from the Calculator4.
 * but still without using try-catch
 */

import java.util.Scanner;

public class Calculator5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int count = 0;
        //you will limit the iteration up to 2 counts.
        while (count < 2) {
            System.out.print("Enter an integer " + (count + 1) + ": ");
            if (input.hasNextInt()) {
                //what is the  statement we need to include here.
                if (count == 0) {
                    num1 = input.nextInt();
                } else {
                    num2 = input.nextInt();
                }
                count++;
            } else {
                System.out.println("Invalid input. ");
                input.nextLine();
            }
        }

        int sum = num1 + num2;
        System.out.println(sum);
    }
}
