package Collections.Sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 */
public class BubbleSortGeneric1 {

//<4>
    public static void main(String[] args) {
        Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        //after sorting
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println();
        String[] list1 = {"ABC", "abc", "abm", "Anf", "Good", "Bad", "nice"};

        bubbleSort(list1);
        System.out.println(Arrays.toString(list1));//without ignoring case. //[ABC, Anf, Bad, Good, abc, abm, nice] - character order


        bubbleSort(list1, (s1, s2) -> s1.compareToIgnoreCase(s2)); //ignore case so alphabetical order ABC abc abm Anf Bad Good nice
        System.out.println(Arrays.toString(list1));

//        for (int i = 0; i < list1.length; i++) {
//       System.out.print(list1[i] + " ");
//       }


        //  public static<E> void bubbleSort(E[] list, Comparator<? super E> comparator){
//        bubbleSort(list1, (s1, s2) -> s1.compareToIgnoreCase(s2)); //new style
//        for (int i = 0; i < list1.length; i++) {
//            System.out.print(list1[i] + " ");
//        }
    }

    //(1) first show this one and show errors because > or < will not work with Generic Type E.
   //so let the student think how to change it. with integer case and also String case.
//    public static <E> void bubbleSort(E[] list){
//
//
//        int i, j, temp = 0;
//        for(i = 0; i < list.length - 1; i++){
//            for(j = 0; j < list.length - 1; j++){
//                if(list[j] > list[j + 1]){
//                    temp = list[j];
//                    list[j] = list[j + 1];
//                    list[j + 1] = temp;
//                }
//            }
//        }
//    }

    //(1-1) old way to use generics by using loop.  //by using Comparable
//    public static<E extends Comparable<E>> void bubbleSort(E[] list){
//
//        for (int i = 0; i < list.length - 1; i++) {
//
//            for (int j = 1; j < list.length ; j++) {
//
//                if (list[j - 1].compareTo(list[j]) > 0) {
//                    E temp = list[j];
//                    list[j] = list[j - 1];
//                    list[j - 1] = temp;
//                }
//            }
//        }
//    }




    //Then, show following two methods connected by using Comparator

    /**
     * helper method
     * @param list
     * @param comparator
     * @param <E>
     */
    //<2>
    private static<E> void bubbleSort(E[] list, Comparator<? super E> comparator){

        for (int k = 1; k < list.length; k++) {
            // Array may be sorted and next pass not needed
         //   needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (   (comparator.compare(list[i], list[i + 1]))    > 0) {
                    // Swap list[i] with list[i + 1]
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }
    //<3> overloading
    /** The method for sorting the numbers */
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {

        bubbleSort(list, (e1, e2) -> e1.compareTo(e2));
    }

    }

