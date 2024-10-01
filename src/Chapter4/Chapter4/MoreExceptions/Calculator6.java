package Ch4Ex1;
/**
 * update Calculator5 by using try-catch
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int count = 0;
        int sum = 0;
        //you will limit the iteration up to 2 counts.
        while (count < 2) {
            System.out.print("Enter an integer " + (count + 1) + ": ");
            try {
                //what is the  statement we need to include here.
                if (count == 0) {
                    num1 = input.nextInt();
                } else {
                    num2 = input.nextInt();
                }
                count++;
            } catch(InputMismatchException ex) {
                System.out.println("Invalid input. ");

            }
            finally{
                input.nextLine();
            }
        }

        sum = num1 + num2;

         System.out.println(sum);
        input.close();
    }
}
