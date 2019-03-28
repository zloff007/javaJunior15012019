package lesson1;

public class main2 {
    public static void main(String[] args) {

        int coshelek = 1000;
        int toyCost = 175;
        int boobleCost = 11;
        int candyCost = 2;


        int toyBuy = coshelek / toyCost;
        int restAfterToyBuy = coshelek - (toyCost * toyBuy);
        int boobleBuy = restAfterToyBuy / boobleCost;
        int restAfterBoobleBuy = restAfterToyBuy - (boobleCost * boobleBuy);

        System.out.println(restAfterBoobleBuy);


    }
}
