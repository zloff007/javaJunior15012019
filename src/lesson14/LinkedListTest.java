package lesson14;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> collection = new LinkedList<>();

        long strtTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            collection.add("sjdsa");
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - strtTime);

        long strtTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            collection.get(i);
        }

        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - strtTime2);

    }
}
