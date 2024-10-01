package GenericMethod;

public class StackOfInteger {

    //field of StackOfInteger
    int [] element;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfInteger() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfInteger(int capacity) {
        element = new int[capacity];
    }

    public void push(int value) {
        if(size >= element.length) {
            int[] newArray = new int[element.length * 2];
            System.arraycopy(element, 0, newArray, 0, element.length);
            element = newArray;
        }
        element[size++] = value;
    }

    public int pop() {
        //size--;
        //return element[size];
        return element[--size];
    }

    public int getSize() {
        return size;
    }

    public int peek() {
        return element[size-1];
    }

    public boolean empty() {
        if(size==0) {
            return true;
        }
        else return false;
    }
}

class StackOfIntegerTester {
    public static void main(String[] args) {
        StackOfInteger st = new StackOfInteger();

        for (int i=0; i<10; i++) {
            st.push(i);
        }
        while(!st.empty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
