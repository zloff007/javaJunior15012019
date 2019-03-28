package lesson6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Добрый день, как вас зовут");
        String inputName = sc.nextLine();
        System.out.println("Привет, " + inputName);
        System.out.println("КАк дела?");
        String inputKakDela = sc.nextLine();

        if (inputKakDela.equals("Хорошо") || inputKakDela.equals("Отлично")){
            System.out.println("ОТлично ");

        } else {
            System.out.println(" Не переживай , все наладится");
        }

    }
}
