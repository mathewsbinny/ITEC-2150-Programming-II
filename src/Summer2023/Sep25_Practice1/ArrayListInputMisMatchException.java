package Sep25_Practice1;
import java.util.List;

public class ArrayListInputMisMatchException {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner (System.in);


        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter an integer: ");
        while (input.hasNextInt()) {
            try {

            } catch(InputMismatchExcpetion im) {
                System.out.println(im);
            }
        }

    }
}
