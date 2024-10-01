package Ch4Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * utilize finally
 */
public class Calculator7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int count = 0;
        //you will limit the iteration up to 2 counts.
        while (count < 2) {
            System.out.print("Enter an integer " + (count + 1) + ": ");
            try {
                //what is the statement we need to include here.
                if (count == 0) {
                    num1 = input.nextInt();
                } else {
                    num2 = input.nextInt();
                }
                count++;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. ");
            } finally {
                if (count == 2) {
                    int sum = num1 + num2;
                    System.out.println(sum);
                }
                input.nextLine();
            }
        }
        input.close();
    }
}
