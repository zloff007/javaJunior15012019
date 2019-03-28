package lesson17;

import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<String,Integer>refregerator = new HashMap<>();
        refregerator.put("Apple",2);
        refregerator.put("Peach",3);
        refregerator.put("Orange",4);
        refregerator.put("Grape",5);
        refregerator.put("Banana",6);
        refregerator.put("Apple",3);
        System.out.println(refregerator);

        Set<String>nameProduct = refregerator.keySet();
        for (String s:nameProduct){
            System.out.println(s);
        }
    }
}
