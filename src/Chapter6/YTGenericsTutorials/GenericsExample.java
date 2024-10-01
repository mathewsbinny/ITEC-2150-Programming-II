package YTGenericsTutorials;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        //Generics solves type safety issues
        Printer<Integer> integerPrinter = new Printer<>(23);
        integerPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(23.00);
        doublePrinter.print();

        Printer<String> stringPrinter = new Printer<>("Apple");
        stringPrinter.print();

        //Wildcards
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.00);
        printList(doubleList);
    }
    public static void printList(List<?> myList) { //Use a question mark, can extend <? extends Animal> to have bounded wildcards
        System.out.println();
    }
}
