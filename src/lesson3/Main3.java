package lesson3;

public class Main3 {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        int[] numbers1 = {2, 33, 4, 55, 6, 77, 8};

        for (int i = 0; i < numbers.length; i++){ //заполняет массив
            numbers[i] = i + 2;
        }

        for (int i = 0; i < numbers1.length; i++) { //печатает массив
            System.out.println(numbers1[i]);

        }

    }
}
