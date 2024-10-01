package GenericMethod;
import java.util.ArrayList;

public class GenericStack <E> {
    private ArrayList<E> list = new ArrayList<E>();

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(list.size()-1);
    }

    public E pop() {
        E eRemoved = list.get(getSize()-1);
        list.remove(getSize()-1);

        return eRemoved;
    }

    //add the element to the stack
    public void push(E el) {
        list.add(el);
    }

    public boolean empty() {
        return list.isEmpty();
    }

    public String toString() {
        return list.toString();
    }
}

class GenericStackTester {
    public static void main(String[] args) {
        GenericStack<String> gt = new GenericStack<>();
    }
}
