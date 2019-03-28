package lesson1;

import sun.net.SocksProxy;

public class MyFirstClass {

    public static void main(String[] args) {
        byte a = 127;
        a++;
        System.out.println(a);

        char simbolY = 'y';
        byte one = 1;
        int tree = one; // преобразование типов - автоматически

        byte number = (byte) tree;


    }

}
