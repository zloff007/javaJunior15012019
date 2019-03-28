package lesson1;

public class main {

    public static void main(String[] args) {
        int shirinaRoom = 6;
        int dlinnaRoom = 15;
        int shirinaStola = 2;
        int dlinnaStola = 3;

        int plosgadRoom = shirinaRoom * dlinnaRoom;
        int ploshadStola = shirinaStola * dlinnaStola;
        int kolishesnvo = plosgadRoom / ploshadStola;

        System.out.println(kolishesnvo);
    }
}
