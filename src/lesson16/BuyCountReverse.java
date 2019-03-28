package lesson16;

import java.util.Comparator;

public class BuyCountReverse implements Comparator<Tovar> {

    @Override
    public int compare(Tovar o1, Tovar o2) {


        if (o1.getBuyCount() != o2.getBuyCount()) {
            return o2.getBuyCount() - o1.getBuyCount();
        }
        if (o1.getReiting() != o2.getReiting()) {
            return o2.getReiting() - o1.getReiting();
        }
        if (o1.getViev() != o2.getViev()) {
            return o2.getViev() - o1.getViev();
        }
        if (o1.getReviev() != o2.getReviev()) {
            return o2.getReviev() - o1.getReviev();
        }
        if (o1.getPrice() != o2.getPrice()) {
            return o2.getPrice() - o1.getPrice();
        }
        return o2.getName().compareTo(o1.getName());

    }
}
