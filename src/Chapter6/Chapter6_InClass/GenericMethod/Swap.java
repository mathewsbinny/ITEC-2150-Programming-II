package GenericMethod;

import java.util.Arrays;

/**
 * demo of creating a generic method
 */

public class Swap {

    public void swapNonGeneric(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index1] = temp;
    }

    public <T> void swap(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

class SwapTester {
    public static void main(String[] args) {
        Swap sw = new Swap();
        Integer [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));

        sw.swap(arr, 2, 1);
        System.out.println(Arrays.toString(arr));
    }
}
