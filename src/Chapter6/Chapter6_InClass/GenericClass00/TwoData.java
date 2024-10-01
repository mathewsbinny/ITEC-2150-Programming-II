package GenericClass00;

public class TwoData <T>{

    private T first;
    private T second;

    public TwoData(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

}

class TwoDataTester {
    public static void main(String[] args) {
        TwoData<Double> td = new TwoData<Double>(Double.valueOf(0), Double.valueOf(1)); //int value not Double value

        Double first = td.getFirst();
        Double second = td.getSecond();

        double fs = td.getFirst();
        double ss = td.getSecond();

        Double fValue = new Double(fs);
        Double sValue = Double.valueOf(ss);
    }
}
