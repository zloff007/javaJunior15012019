package lesson13;

public class FractionNumberImpl implements FractionNumber{

    private int chislitel;
    private int znamenatel;

    public FractionNumberImpl(){

    }

    public FractionNumberImpl(int chislitel,int znamenatel ){

        this.chislitel = chislitel;
        this.znamenatel = znamenatel;


    }


    @Override
    public void setDividend(int dividend) {

        this.chislitel = dividend;

    }

    @Override
    public int getDividend() {
        return this.chislitel;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {

        this.znamenatel = divisor;

    }

    @Override
    public int getDivisor() {
        return this.znamenatel;
    }

    @Override
    public double value() {
        return this.chislitel / (double)this.znamenatel;
    }

    @Override
    public String toString() {
        return  chislitel + " / " + znamenatel;
    }
}
