package lesson8;

import java.util.Scanner;

public class Dz {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number");
        num1 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operation");
        operation = op.next();

        System.out.println("please enter the second number");
        num2 = input.nextInt();



        if (operation.equals("+"))
        {
            System.out.println("your answer is  " + (num1 + num2));
        }
        if (operation.equals("-"))
        {
            System.out.println("your answer is" + (num1 - num2));
        }
        if (operation.equals("/"))
        {
            System.out.println("your answer is" + (num1 / num2));
        }
        if (operation .equals( "*"))
        {
            System.out.println("your answer is" + (num1 * num2));
        }
    }
}