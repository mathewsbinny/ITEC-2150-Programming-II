package Collections.Sort;

import java.util.Arrays;

/**
 * https://www.acodersjourney.com/bubble-sort/ important site for you (ITEC 2150 -
 * summer students).
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {2, 5, 3, 13, 3, 100, 9, 6, 4};
        BubbleSort ob = new BubbleSort();
        ob.bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }

    public void bubbleSort(int[] list){
        boolean needNextPass = true;
        for(int k = 1; k < list.length && needNextPass; k++){
            //array may be sorted and next pass not needed.
            needNextPass = false;
            for(int i = 0; i < list.length - k; i++){
                if(list[i] > list[ i + 1]){
                    //swap list[i] with list[ i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i +1] = temp;

                    needNextPass  = true; //next pass still needed.
                }
            }

        }
    }
//    public  void bubbleSort(int arr[])
//    {
//        int n = arr.length;
//        for (int i = 0; i < n-1; i++)
//            for (int j = 0; j < n-i-1; j++)
//                if (arr[j] > arr[j+1])
//                {
//                    // swap arr[j+1] and arr[j]
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//    }
}
//    public int[] bubbleSort(int[] list) {
////{2, 9, 5, 4, 8, 1, 6}
//
//        int i, j, temp = 0;
//        for (i = 0; i < list.length - 1; i++) {
//
//            for (j = 0; j < list.length - 1 ; j++) {
//
//                if (list[j] > list[j + 1]) {
//                    temp = list[j];
//                    list[j] = list[j + 1];
//                    list[j + 1] = temp;
//                }
//            }
//        }
//        return list;
//    }

