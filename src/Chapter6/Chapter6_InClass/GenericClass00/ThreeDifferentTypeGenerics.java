package GenericClass00;

public class ThreeDifferentTypeGenerics <T, U, V>{

    private T variableT;
    private U variableU;
    private V variableV;

    public ThreeDifferentTypeGenerics( T varT, U varU, V varV ) {
        this.variableT = varT;
        this.variableU = varU;
        this.variableV = varV;
    }

    public T getVariableT() {
        return variableT;
    }
    public U getVariableU() {
        return variableU;
    }
    public V getVariableV() {
        return variableV;
    }

}
