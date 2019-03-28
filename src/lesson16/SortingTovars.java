package lesson16;

import java.util.HashSet;
import java.util.TreeSet;

public class SortingTovars {


    public static void sortByPrice(HashSet<Tovar> tovars) {

        TreeSet<Tovar> rezult = new TreeSet<>();
        rezult.addAll(tovars);

        for (Tovar t : rezult) {
            System.out.println(t);
        }
    }

    public static void sortByPriceReverse(HashSet<Tovar> tovars) {

        TreeSet<Tovar> rezult = new TreeSet<>(new PriceReverse());
        rezult.addAll(tovars);

        for (Tovar t : rezult) {
            System.out.println(t);

        }
    }


    public static void sortBuyCount(HashSet<Tovar> tovars) {
        TreeSet<Tovar> rezult = new TreeSet<>(new BuyCount());
        rezult.addAll(tovars);

        for (Tovar t : rezult) {
            System.out.println(t);

        }

    }

    public static void sortBuyCountReverse(HashSet<Tovar> tovars) {
        TreeSet<Tovar> rezult = new TreeSet<>(new BuyCountReverse());
        rezult.addAll(tovars);

        for (Tovar t : rezult) {
            System.out.println(t);

        }

    }
    public static void sortBuyReiting(HashSet<Tovar> tovars) {
        TreeSet<Tovar> rezult = new TreeSet<>(new BuyReiting());
        rezult.addAll(tovars);

        for (Tovar t : rezult) {
            System.out.println(t);

        }


    }
        public static void sortBuyReitingReverse(HashSet<Tovar> tovars) {
        TreeSet<Tovar> rezult = new TreeSet<>(new BuyReitingReverse());
        rezult.addAll(tovars);

        for (Tovar t : rezult) {
            System.out.println(t);

        }
    }

    public static void sortBuyViev(HashSet<Tovar> tovars) {
        TreeSet<Tovar> rezult = new TreeSet<>(new BuyViev());
        rezult.addAll(tovars);

        for (Tovar t : rezult) {
            System.out.println(t);

        }

    }
    public static void sortBuyVievReverse(HashSet<Tovar> tovars) {
        TreeSet<Tovar> rezult = new TreeSet<>(new BuyVievReverse());
        rezult.addAll(tovars);

        for (Tovar t : rezult) {
            System.out.println(t);

        }

    }
    public static void sortBuyReviev(HashSet<Tovar> tovars) {
        TreeSet<Tovar> rezult = new TreeSet<>(new BuyReviev());
        rezult.addAll(tovars);

        for (Tovar t : rezult) {
            System.out.println(t);

        }

    }
    public static void sortBuyRevievReverse(HashSet<Tovar> tovars) {
        TreeSet<Tovar> rezult = new TreeSet<>(new BuyRevievReverse());
        rezult.addAll(tovars);

        for (Tovar t : rezult) {
            System.out.println(t);

        }

    }
    public static void sortBuyName(HashSet<Tovar> tovars) {
        TreeSet<Tovar> rezult = new TreeSet<>(new BuyReviev());
        rezult.addAll(tovars);

        for (Tovar t : rezult) {
            System.out.println(t);

        }

    }
    public static void sortBuyNameReverse(HashSet<Tovar> tovars) {
        TreeSet<Tovar> rezult = new TreeSet<>(new BuyRevievReverse());
        rezult.addAll(tovars);

        for (Tovar t : rezult) {
            System.out.println(t);

        }

    }

}