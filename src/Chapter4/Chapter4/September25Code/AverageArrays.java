package ExceptionHandlingDemo.sep25;
/**
 * incorrectly handled.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class AverageArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] x = new double[4];

        double average = 0.0;
        double sum = 0.0;

        for(int i = 0; i < x.length; i++){
            try {
                System.out.print("Enter a double value " + (i + 1) + ": ");
                x[i] = input.nextDouble();
                sum += x[i];
            }catch(InputMismatchException im){
                System.out.println("Input mismatch Exception");
            }
        }

        average = sum /x.length;
        System.out.println("Average of four number is " + average);

    }

}
