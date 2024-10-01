package ExceptionHandlingDemo;

public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arrayList = {1, 2, 3};
        int indexValue = arrayList[10];

        System.out.println(indexValue);
    }
}
