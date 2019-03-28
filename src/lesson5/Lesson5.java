package lesson5;

public class Lesson5 {
    public static void main(String[] args) {

    int [] [] numbers = {{2,4,7,7},{2,5,8,3}};


//        System.out.print(numbers[0][0] + " ");
//        System.out.print(numbers[0][1] + " ");
//        System.out.print(numbers[0][2] + " ");
//        System.out.print(numbers[0][3] + " ");
//
//        System.out.println();
//
//        System.out.print(numbers[1][0] + " ");
//        System.out.print(numbers[1][1] + " ");
//        System.out.print(numbers[1][3] + " ");

        for ( int i = 0; i < numbers.length; i ++){
            for ( int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
