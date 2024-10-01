package ExceptionHandlingDemo.sep25;

/**
 * demo of IndexOutOfBoundsException
 */
public class IndexOutOfBoundsExceptioDemo {
    public static void main(String[] args) {
        int[] arrayList = {1,2,3};

        try {
            int indexValue = arrayList[10];

            System.out.println(indexValue);
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println("IndexOutOfBoundsException occurred");
        }
    }
}
