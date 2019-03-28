package lesson15;

import java.util.HashSet;

public class Main2 {

    public static void main(String[] args) {

        Coin coin1 = new Coin(2.5,1990,2);
        Coin coin2 = new Coin(2,1900,25);
        Coin coin3 = new Coin(4,1990,2);
        Coin coin4 = new Coin(2.5,1950,2);
        Coin coin5 = new Coin(2.5,1990,2);

        HashSet<Coin> coins = new HashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        System.out.println(coin1.equals(coin5));

        for (Coin coin: coins){
            System.out.println(coin);
        }

    }
}
