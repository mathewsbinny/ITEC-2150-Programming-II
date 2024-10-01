package GenericMethod;

public class CalculatorGenericMethod {
    public <T extends Number> double add(T[] arr) {
        //throw illegalArgumentException if the array is null or empty
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        //declare the sum or total variable and initialize with 0
        double sum = 0;

        //iterate all elements and add each to sum or total
        for (T x:arr) {
            sum += x.doubleValue();
        }

        return sum;
        //then how to return the double value or primitive type
        //you will need to call the doubleValue() method
    }
}
