package lesson16;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Tovar> tovars = new HashSet<>();

        Tovar tovar1 = new Tovar(12,1000,"Мышка",1,7,10);
        Tovar tovar2 = new Tovar(11,1200,"Флешка",2,10,11);
        Tovar tovar3 = new Tovar(10,1300,"Мышка1",3,7,13);
        Tovar tovar4 = new Tovar(9,1400,"Мышка2",4,6,12);
        Tovar tovar5 = new Tovar(8,1500,"Мышка3",5,3,11);
        Tovar tovar6 = new Tovar(7,1600,"Мышка4",5,5,17);

        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);
        tovars.add(tovar6);

        SortingTovars.sortByPrice(tovars);
        System.out.println("-------");
        SortingTovars.sortByPriceReverse(tovars);
        System.out.println();
        SortingTovars.sortBuyCount(tovars);
        System.out.println();
        SortingTovars.sortBuyCountReverse(tovars);
        System.out.println();
        SortingTovars.sortBuyReiting(tovars);
        System.out.println();
        SortingTovars.sortBuyReitingReverse(tovars);
        System.out.println();
        SortingTovars.sortBuyViev(tovars);
        System.out.println();
        SortingTovars.sortBuyVievReverse(tovars);
        System.out.println();
        SortingTovars.sortBuyReviev(tovars);
        System.out.println();
        SortingTovars.sortBuyRevievReverse(tovars);
        System.out.println();
        SortingTovars.sortBuyName(tovars);
        System.out.println();
        SortingTovars.sortBuyRevievReverse(tovars);

    }
}
