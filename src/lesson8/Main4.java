package lesson8;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main4 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int summa = 0;
        for (int i = 0 ; i < 100000; i++){
        summa = summa + i;

        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        Date curretDate = new Date(startTime);
        System.out.println(curretDate);

        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        System.out.println("date: " + formatDate.format(curretDate) );

    }
}
