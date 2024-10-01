import java.util.List;
public class NumberSumCalculatorGeneric {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        System.out.println("Sum of Integer List: " + sumOfList(integerList));

        List<Double> doubleList = List.of(1.5, 2.5, 3.5);
        System.out.println("Sum of Double List: " + sumOfList(doubleList));

        List<Float> floatList = List.of(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println("Sum of Float List: " + sumOfList(floatList));
    }
    // CREATE sumOfList method by taking upper bounded wildcard. You need to make the method that accept a list of objects that are instances of Number or its subclasses like Integer, Double, or Float, etc.
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}

