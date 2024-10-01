package ExceptionHandlingDemo;

/**
 * ArithmeticException2
 *  - This class demonstrates the ArithmeticException
 *  - This class demonstrates the try-catch block
 *  - This class demonstrates the printStackTrace() method
 */
public class ArithmeticException2 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i <= 2; i++) {
                System.out.print(i + " ");
                System.out.println(1 / 0);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero");
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
