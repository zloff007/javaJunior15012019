package lesson3;

public class Main4 {
    public static void main(String[] args) {
        int [] numbers = {7,10,13,-1,2,-2,80};
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa = summa + numbers[i];


        }
        System.out.println(summa);
    }
}
