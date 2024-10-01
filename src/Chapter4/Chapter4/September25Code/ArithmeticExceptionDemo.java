package ExceptionHandlingDemo;

/**
 * ArithmeticExceptionDemo
 * - This class demonstrates the ArithmeticException
 * - This class demonstrates the try-catch block
 *
 */

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 1);
        }catch(ArithmeticException e){
            System.out.println("you cannot divide the number by zero");
        }catch(Exception e){
            System.out.println("overall exception. ");
        }finally{
            System.out.println("no matter what it will print out.");
        }

    }
}
