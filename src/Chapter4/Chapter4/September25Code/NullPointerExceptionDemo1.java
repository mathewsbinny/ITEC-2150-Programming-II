package ExceptionHandlingDemo.sep25.NullPointerExceptionDemo;
/**
 * NullPointerException Demo
 */

import java.util.Date;

public class NullPointerExceptionDemo1 {

    public static void main(String[] args) {
        Date date = null;
        try {
            long day = date.getTime();

        }catch(NullPointerException e){
            System.out.println(e);
        }
    }
}
