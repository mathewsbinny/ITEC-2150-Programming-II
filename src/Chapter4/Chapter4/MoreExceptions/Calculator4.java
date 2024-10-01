package Ch4Ex1;

/**
 * use the while loop without exception handling, we will handle incorrect values separately.
 * only correct incorrect value.
 */
public class Calculator4 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        //first value input
        while(true){
            System.out.print("Enter first integer values: ");
            if(input.hasNextInt()){
                num1 = input.nextInt();
                break;
            }
            else{
                System.out.println("Enter a valid integer value");
                input.nextLine();
            }
        }
        //second value input
        while(true)
        {
            System.out.print("Enter second integer values: ");
            if(input.hasNextInt()){
                num2 = input.nextInt();
                break;
            }
            else{
                System.out.println("Enter a valid integer value");
                input.nextLine();
            }
        }
        int sum = num1 + num2;
        System.out.println("Sum is " + sum);
        input.close();
    }
}
