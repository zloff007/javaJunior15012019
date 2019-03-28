package lesson16;

import java.util.Objects;

public class Tovar implements Comparable <Tovar> {

    private int buyCount;
    private int price;
    private String name;
    private int reiting;
    private int viev;
    private int reviev;

    public Tovar() {
    }

    public Tovar(int buyCount, int price, String name, int reiting, int viev, int reviev) {
        this.buyCount = buyCount;
        this.price = price;
        this.name = name;
        this.reiting = reiting;
        this.viev = viev;
        this.reviev = reviev;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReiting() {
        return reiting;
    }

    public void setReiting(int reiting) {
        this.reiting = reiting;
    }

    public int getViev() {
        return viev;
    }

    public void setViev(int viev) {
        this.viev = viev;
    }

    public int getReviev() {
        return reviev;
    }

    public void setReviev(int reviev) {
        this.reviev = reviev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tovar tovar = (Tovar) o;
        return buyCount == tovar.buyCount &&
                price == tovar.price &&
                reiting == tovar.reiting &&
                viev == tovar.viev &&
                reviev == tovar.reviev &&
                Objects.equals(name, tovar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buyCount, price, name, reiting, viev, reviev);
    }

    @Override
    public String toString() {
        return "Tovar - " +
                "buyCount = " + buyCount +
                ", price = " + price +
                ", name = '" + name + '\'' +
                ", reiting = " + reiting +
                ", viev = " + viev +
                ", reviev = " + reviev +
                '}';
    }


    @Override
    public int compareTo(Tovar o) {
        if (this.price != o.price) {
            return this.price - o.price;
        }
        if (this.buyCount != o.buyCount) {
            return this.buyCount - o.buyCount;
        }
        if (this.reiting != o.reiting) {
            return this.reiting - o.reiting;
        }
        if (this.viev != o.viev) {
            return this.viev - o.viev;
        }
        if (this.reviev != o.reviev) {
            return this.reviev - o.reviev;
        }

        return this.name.compareTo(o.name);
    }
}
