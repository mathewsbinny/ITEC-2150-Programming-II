package Ch4Ex1;

import java.util.InputMismatchException;

/**
 * this time we will use a boolean type flag and dd-while loop
 *
 */
public class Calculate3 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        int sum = 0;

        boolean isValidInput = false;

        do{

            System.out.print("Enter two integers: ");
            try{
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                sum = num1 + num2;
                isValidInput = true;
            }catch(InputMismatchException ex){
                System.out.print("Invalid Inputer. ");
                input.nextLine();
            }
        }while(!isValidInput);
        System.out.println(sum);
        input.close();

    }
}
