package lesson6;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String[] [] tours = {{"Греция" , "15000", "7", "дней", " 2 ", "звезд", "Все включено"},
                             {"Франция" , "55000", "10", "дней", " 3 ", "звезд", "Полупансион"},
                             {"Италия" , "35000", "7", "дней", " 4 ", "звезд", "Пансион"},
                             {"Германия" , "25000", "6"," дней", " 3 ", "звезд", "Все включено"},
                             {"Мальдивы" , "150000", "15", "дней", "5", "звезд", "Все включено"}};


        System.out.println("В какую страну хотите поехать");
        Scanner sc = new Scanner(System.in);
        String inputCountry = sc.nextLine();
        SearchTour.printToursByCountry(inputCountry, tours);

        System.out.println("введите цену от тура: ");
        String inputPrice = sc.nextLine();
        SearchTour.printToursByPriceFrom(inputPrice, tours );

        System.out.println("на сколько дней : ");
        String inputDays = sc.nextLine();
        SearchTour.printToursByDays(inputDays, tours );

        System.out.println("Тип тура");
        Scanner tt = new Scanner(System.in);
        String inputTypeToures = tt.nextLine();
        SearchTour.printTypeTours(inputTypeToures, tours);

//        System.out.println("Суммв всех туров");
//        String inputSummaAllTours = sc.nextLine();
//        SearchTour.printSummaAllTous(inputSummaAllTours, tours);

    }
}
