package Ch4Ex1;

/**
 * use try-catch without any loop technique first.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        try {
            System.out.print("Enter two integer values: ");
            int num1 = input.nextInt(), num2 = input.nextInt();
            sum = num1 + num2;
        }catch(InputMismatchException im){
            System.out.println("Invalid type. Must provide an integer value. ");
        }
        finally{
            input.close();
            if( sum != 0){
                System.out.println(sum);
            }
        }

      //  System.out.println("Sum of two values is " + sum);



    }
}
