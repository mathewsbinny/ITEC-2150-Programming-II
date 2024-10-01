package GenericClass00;

/**
 * generic class demo
 * @param <T> T is a generic type
 */
public class GenericClass<T> {
    private T refVariable ;
    public void setRefVariable(T refVariable) {
        this.refVariable = refVariable;
    }
    public T getRefVariable() {
        return refVariable;
    }
}

class GenericClassTester {
    public static void main(String[] args) {
        // GenericClass gc2 = new GenericClass();
        GenericClass<Integer> gc = new GenericClass<>();
        gc.setRefVariable(78);

        GenericClass<String> gc2 = new GenericClass<>();
        gc2.setRefVariable("Hi Orange");
        System.out.println(gc2.getRefVariable());
    }
}
