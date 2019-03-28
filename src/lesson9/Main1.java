package lesson9;

public class Main1 {

    public static void main(String[] args) {

        DrobnoeChislo drob1 = new DrobnoeChislo();
        DrobnoeChislo drob2 = new DrobnoeChislo();

        drob1.setChislitel(3);
        drob1.setZnamenatel(15);

        drob2.setChislitel(4);
        drob2.setZnamenatel(18);

       int rezult = UtilsForDrobi.commonZnamm(drob1, drob2);
        System.out.println(rezult);
    }



}
