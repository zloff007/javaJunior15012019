package lesson3;

public class Lesson4 {

    public static void main(String[] args) {
        for (int i = 0; i <365 ; i++){
            for (int j = 0; j < 24; j++){
                for (int k = 0; k <60; k++){
                    for (int second = 0; second<60; second++){
                        System.out.println(" От старта прошло: "+i+" дня, "+j+" часа, "+k+" миннут, "+second+" секунл");
                        try {
                            Thread.sleep( 1000) ;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}
