package lesson4;

public class Bank {

    public static void main(String[] args) {
        int vklad = 10000;
        int procent = 9;
        int year = 7;

           for (int i = 0 ; i < year; i++) {
               vklad = vklad + (vklad/100*procent);
           }
                   System.out.println(vklad);



    }
}
