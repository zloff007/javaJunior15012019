package lesson16;

import java.util.Comparator;

public class SortBuyNameReverse implements Comparator<Tovar> {

        @Override
        public int compare(Tovar o1, Tovar o2) {

        if (o1.getName() != o2.getName()) {
            return o2.getName().compareTo(o1.getName());
        }
        if (o1.getReviev() != o2.getReviev()) {
            return o1.getReviev() - o2.getReviev();
        }
        if (o1.getPrice() != o2.getPrice()) {
            return o1.getPrice() - o2.getPrice();
        }
        if (o1.getBuyCount() != o2.getBuyCount()) {
            return o1.getBuyCount() - o2.getBuyCount();
        }
        if (o1.getReiting() != o2.getReiting()) {
            return o1.getReiting() - o2.getReiting();
        }

        return o1.getViev() - (o2.getViev());

    }
}

