package lesson13.practika;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите название страны");
        Scanner scanner = new Scanner(System.in);
        String inputCountry = scanner.next();

        AbstractCountry country = null;

        if (inputCountry.equalsIgnoreCase("Германия")) {
            Country germania = new Germania();
            country.setCoutKurort(234);
            country.setPloshad(6789000);
            country.setStolica("Berlin");
            country.setNaselenie(1200300);
            country.setViza(true);

        }

        if (inputCountry.equalsIgnoreCase("Италия")){
            Country italia  = new Italia ();
            country.setCoutKurort(23);
            country.setPloshad(96789000);
            country.setStolica("Rim");
            country.setNaselenie(91200300);
            country.setViza(true);

        }
        System.out.println("Что вы хотите узнать о стране - ");
        System.out.println("1 - Население");
        System.out.println("2 - Площадь");
        System.out.println("3 - Столица");
        System.out.println("4 - кол-во курортов");
        System.out.println("5 - нужна ли виза");

        int inputAction = scanner.nextInt();
        switch (inputAction){
            case 1: country.printNaselenie();
                break;
            case 2: country.printPloshad();
                break;
            case 3:
                break;
            case 4: country.printCountKurort();
                break;
            case 5:
                break;
                default:
                    System.out.println("Такой цифры нет");
        }
    }
}
