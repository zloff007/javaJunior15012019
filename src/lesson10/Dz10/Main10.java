package lesson10.Dz10;

public class Main10 {

    public static void main(String[] args) {

        Auto auto = new Auto();

        Sedan sedan = new Sedan("Lada1", 2018, "Vesta", 16, 400000);
        Crossover crossover = new Crossover("Lada2", 2019, "Vests Cross", 17, 600000);
        Miniven miniven = new Miniven("Lada3", 2018, "Largus", 19, 750000);

        Auto[] diller = new Auto[3];
        diller[0] = sedan;
        diller[1] = crossover;
        diller[2] = miniven;


        for (int i = 0; i < diller.length; i++) {
            diller[i].print();
            System.out.println();

        }
    }
}