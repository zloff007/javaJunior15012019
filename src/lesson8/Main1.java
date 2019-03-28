package lesson8;

public class Main1 {
    public static void main(String[] args) {

        int mark = 4;
        switch (mark){
            case 2:
                System.out.println("Очень плохо");
                break;
            case 3:
                System.out.println("На очень");
                break;
            case 4:
                System.out.println("Хорого");
                break;
            case 6:
                System.out.println("Отлично");
                break;
                default:
                    System.out.println("Это не оценка");

        }

    }
}
