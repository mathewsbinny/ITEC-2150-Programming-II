package YTGenericsTutorials.client;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        Container<Integer,String> container = new Container<>(12, "Hello");
        int val1 = container.getItem1();
        String val2 = container.getItem2();

        Container<Double,Integer> container2 = new Container<>(12.00, 300);
        double val3 = container2.getItem1();
        int val4 = container2.getItem2();

        Set<String> mySet1 = new HashSet<String>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("third");

        Set<String> mySet2 = new HashSet<String>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("smartphone");

        Set<String> resultSet = union(mySet1, mySet2);

        Iterator<String> itr = resultSet.iterator();
        while(itr.hasNext()) {
            String var = itr.next();
            System.out.println(var);
        }
    }

    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
