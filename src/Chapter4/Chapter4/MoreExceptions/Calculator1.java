package Ch4Ex1;

/**
 * Create a simple addition calculator in Java.
 * The program should prompt the user to enter 2 integers, then adds the numbers
 * and prints the result. Make sure the program includes
 * appropriate exception handling in case the user does not enter appropriate integer values.
 */
import java.util.Scanner;
public class Calculator1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.print("Enter two integers: ");
            if(input.hasNextInt()) {
                int num1 = input.nextInt();
                if(input.hasNextInt()){
                    int num2 = input.nextInt();
                    sum = num1 + num2;
                    break;
                }
                else{
                    System.out.println("Invalid input. You must enter the correct integer value for the second number. ");
                    input.nextLine();
                }
            }
            else{
                System.out.println("Invalid input. You must enter the correct integer value for the first number.");
                input.nextLine();
            }
        }

        System.out.println("Sum of two values is " + sum);
        input.close();

    }
}
