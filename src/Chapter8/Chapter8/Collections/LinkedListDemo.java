package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<>();
        for(int i = 0; i < 500000; i++) {
            llist.add(i);
        }
        // System.out.println(llist);
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < llist.size(); i++) {
            llist.get(0);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("By using for loop: " + (endTime - startTime));

        int x;

        startTime = System.currentTimeMillis();
        for(int i:llist) {
           x = i;
        }

        endTime = System.currentTimeMillis();

        System.out.println("By using enhanced for loop: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        int y;
        Iterator<Integer> iterator = llist.iterator();
        while(iterator.hasNext()) {
            y = iterator.next();
        }
        System.out.println("By using iterator: " + (endTime - startTime));
    }
}
