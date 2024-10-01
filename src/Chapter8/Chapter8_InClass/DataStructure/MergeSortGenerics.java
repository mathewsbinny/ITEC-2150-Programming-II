package Collections.Sort;

import java.util.Comparator;

public class MergeSortGenerics {


    //<1>
    // <? super E> means unknown type that is, or unknown type is a super class of E
    // so super class's lower bound is E.
    //this signature is used because E may be assigned to and compared with any
    //variable whose type is or a super class of E.
    //if a Comparator can access a super class of E in its compare() method, you can pass in a E.
    //with another example, <? super E> is used to declare two arguments with different type.
public static<E> void mergeSort(E[] list, Comparator<? super E> comparator){
    if(list.length > 1){
        //partition the first half of the list
        E[] firstHalf = (E[]) new Object[list.length / 2];
        System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
        mergeSort(firstHalf, comparator);

        //partition or divide the list into two and make the second half
        int secondHalfLength = list.length - list.length / 2;
        E[] secondHalf = (E[]) new Object[secondHalfLength];
        System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
        mergeSort(secondHalf, comparator);


        //<2> stop here and create overloaded method of mergeSort

        //<4> merge firstHalf with secondHalf
        E[] temp = merge(firstHalf, secondHalf, comparator);
        System.arraycopy(temp, 0, list, 0, temp.length);


    }

}
//<2-2>
//bounded type from Comparable interface and this is a method for sorting the numbers.
public static<E extends Comparable<E>> void mergeSort(E[] list){
    //use lambda
    mergeSort(list, (e1, e2) -> ((Comparable<E>)e1).compareTo(e2));


}

//<3>
    private static<E> E[] merge(E[] list1, E[] list2, Comparator<? super E> comparator){
    E[] temp = (E[]) new Object[list1.length + list2.length];
    int current1 = 0; //index in list1
    int current2 = 0; //index in list2
    int current3 = 0; //index in temp

    while(current1 < list1.length && current2 < list2.length){
        if(comparator.compare(list1[current1], list2[current2]) < 0){
            temp[current3++] = list1[current1++];
        }
        else{
            temp[current3++] = list2[current2++];
        }
    }
        while(current1 < list1.length){
            temp[current3++] = list1[current1++];
        }
        while(current2 < list2.length){
            temp[current3++] = list2[current2++];
        }
        return temp;
    }

    //<5> test
    public static void main(String[] args) {

    Integer[] list = {2,3,2,6,1,-2,3,1,14,12};
    mergeSort(list);
    for(int i = 0; i < list.length; i++){
        System.out.print(list[i] + " ");
    }

        System.out.println();
    String[] list1 = {"ABC","abc","abm","Anf","Good","Bad","Nice"};
    mergeSort(list1, (s1,s2) -> s1.compareToIgnoreCase(s2));
    for(int i = 0; i < list1.length; i++){
        System.out.print(list1[i] + " ");
    }

    }
}
