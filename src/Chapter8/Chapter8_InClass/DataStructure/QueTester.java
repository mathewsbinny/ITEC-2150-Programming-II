package Collections;
import java.util.LinkedList;
import java.util.Queue;
public class QueTester {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println(queue);
        queue.add("Alabama");
        queue.add("Georgia");
        queue.add("Nebraska");
        queue.add("Minnesota");
        queue.add("Massachusetts");
        queue.add("Maryland");
        System.out.println(queue);

        queue.offer("Florida");
        queue.offer("California");
        queue.offer("South Carolina");

        System.out.println(queue);

        System.out.println(queue.poll());//"Alabama"
        System.out.println(queue.peek());
        System.out.println(queue.element());
    }
}
