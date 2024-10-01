package ExceptionHandlingDemo.sep25;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 * description: this will do the demonstration of InputMismatchException by using ArrayList
 */
public class ArrayListInputMisMatchException {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter an integer: ");

        while(input.hasNextInt()){
            try{
                list.add(input.nextInt());
            }catch(InputMismatchException im){
                System.out.println(im);
            }
        }

    }
}
