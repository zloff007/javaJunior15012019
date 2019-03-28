package lesson15;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String> strings = new HashSet<>();
        strings.add("q111111");
        strings.add("w222222");
        strings.add("e333333");
        strings.add("r444444");
        strings.add("t555555");

        for (String s:strings){
            System.out.println(s);

        }

         for (Iterator<String> iter = strings.iterator();iter.hasNext();){

             System.out.println(iter.next());

         }


    }

}
