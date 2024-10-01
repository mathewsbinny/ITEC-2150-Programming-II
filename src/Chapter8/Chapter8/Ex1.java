package Ch8_HW;

import java.util.ArrayList;

public class Ex1 {
    public static <E> void reverseArrayListInPlace(ArrayList<E> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            E temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("List 1: " + arrayList);
        reverseArrayListInPlace(arrayList);
        System.out.println("List 2: " + arrayList);
    }
}
