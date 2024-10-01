package SourceAndDestination;

import java.util.List;
import java.util.ArrayList;

public class GenericSourceDestination {

    public static <T, U> void processing(List<? extends T> source, List<? super U> destination) {
        for (T x: source) {
            //Object newProcessValue = x
            U newProcessValue = (U)x;
            destination.add(newProcessValue);
        }
    }
}

class GenericSourceDestinationTester {
    public static void main(String[] args) {

        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);
        sourceList.add(4);

        List<Number> destination = new ArrayList<>();
        GenericSourceDestination.processing(sourceList, destination);

        System.out.println(destination);
    }
}
