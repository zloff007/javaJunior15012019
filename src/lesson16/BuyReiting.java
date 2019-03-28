package lesson16;

import java.util.Comparator;

public class BuyReiting implements Comparator<Tovar> {


        @Override
        public int compare(Tovar o1, Tovar o2) {

            if (o1.getReiting() != o2.getReiting()) {
                return o1.getReiting() - o2.getReiting();
            }
            if (o1.getViev() != o2.getViev()) {
                return o1.getViev() - o2.getViev();
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

            return o1.getName().compareTo(o2.getName());

        }
    }

