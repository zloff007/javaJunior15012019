package lesson2;

public class Dz25 {

    public static void main(String[] args) {

        int summa = 0;
        for (int i = 50; i <= 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                summa = summa + i;
            }

           System.out.println(summa);




        }
    }

}