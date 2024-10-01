package GenericClass00;

public class Container <T> {
    private T content;

    public void put(T item) {
        content = item;
    }

    public T take() {
        T item = content;
        System.out.println("Item: " + item);
        System.out.println("Content: " + content);
        content = null;
        System.out.println("After make the content pointing to the null: " + content);
        System.out.println("After all the item will return: " + item);
        return item;

    }
}

class ContainerTester{
    public static void main(String[] args) {
        Container<Integer> ct = new Container<>();
        ct.put(7);
        Integer result = ct.take();
        System.out.println(result);

    }
}