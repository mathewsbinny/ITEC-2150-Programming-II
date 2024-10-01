package ExceptionHandlingDemo;

import java.util.InputMismatchException;
import java.util.Scanner;
public class AverageArrays2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] x = new double[4];
        double average = 0.0;
        double sum = 0.0;

        for(int i=0; i<x.length; i++){
            // boolean validValueInput = false;
            while(true){
                try{
                    System.out.println("Enter number " + (i+1) + ": ");
                    x[i] = input.nextDouble();
                    sum += x[i];
                    // validValueInput=true;
                    break;
                } catch(InputMismatchException im) {
                    input.nextLine(); //clear buffer
                    System.out.println("Enter the correct or valid input value!!");
                }


            }
        }
        average = sum /x.length;
        System.out.println("Average of four numbers is " + average);
    }
}
