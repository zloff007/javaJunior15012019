package lesson8;

public class Main2 {
    public static void main(String[] args) {

        int apple = 20;

        if (apple > 15) {
            System.out.println("Хвати");

        } else {
            System.out.println("Не хватит");

        }


        String rezult = (apple > 15) ? "Хватит" : "Не хватит";
        System.out.println(rezult);
    }

}
