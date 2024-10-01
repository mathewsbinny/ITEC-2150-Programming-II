package Collections.Sort;

import java.util.Arrays;

public class BubbleSortGenericsSimple {
    public static void main(String[] args) {
        String[] list1 = {"ABC", "abc", "abm", "Anf", "Good", "Bad", "nice"};

         bubbleSort(list1);
        System.out.println(Arrays.toString(list1));//without ignoring case.

        //before java 8, you had to use loop to convert each element to lower or uppercase, but from java8, you
        //can write as below to convert the lowercase or uppercase.

        //change the element of the array to lowercase (to change to the lower or uppecase - way 1) because Comparable interface
        //does not have compareToIgnoreCase.
        list1 =  Arrays.asList(list1).stream().map(String::toLowerCase).toArray(String[]::new);
        bubbleSort(list1);
        System.out.println(Arrays.toString(list1));


    }

    //old way to use generics by using loop.  //by using Comparable
    public static<E extends Comparable<E>> void bubbleSort(E[] list){

            for (int i = 0; i < list.length - 1; i++) {

                for (int j = 1; j < list.length ; j++) {

                    if (     list[j - 1].compareTo(list[j])       > 0) {
                        E temp = list[j];
                        list[j] = list[j - 1];
                        list[j - 1] = temp;
                    }
                }
            }
    }



}
