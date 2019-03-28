package lesson5;

public class Hw51 {

    public static void main(String[] args) {

        int[][] numbers = {{2, 4, 7, 7}, {2, 5, 8, 3}};
        for ( int i = 0; i < numbers.length; i ++){
            for ( int j = 0; j < numbers[i].length; j++){
                if (numbers [i] [j] % 2 == 0) {
                    System.out.println(numbers[i][j] + " ");
                }
            }

                System.out.println(" " + " ");
            }
            System.out.println();

    }

}