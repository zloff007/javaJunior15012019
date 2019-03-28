package lesson15;

import java.util.Objects;

public class Coin {

    private double diametr;
    private int year;
    private int nominal;



    public Coin() {
    }

    public Coin(double diametr, int year, int nominal) {
        this.diametr = diametr;
        this.year = year;
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diametr = " + diametr +
                ", year = " + year +
                ", nominal = " + nominal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return Double.compare(coin.diametr, diametr) == 0 &&
                year == coin.year &&
                nominal == coin.nominal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diametr, year, nominal);
    }
}
