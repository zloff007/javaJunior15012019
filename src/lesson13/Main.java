package lesson13;

public class Main {
    public static void main(String[] args) {

        FractionNumberImpl drob1 = new FractionNumberImpl(1,4);
        FractionNumberImpl drob2 = new FractionNumberImpl(2,7);

        FranctionNumberOperrationImpl operration = new FranctionNumberOperrationImpl();
        FractionNumber rezult = operration.add(drob1,drob2);


    }
}
