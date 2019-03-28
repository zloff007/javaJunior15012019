package lesson13.Dz13;

public class Magazine extends BooCase {
    public Magazine() {

    }

    public Magazine(String namebook, int numberpage, String text) {
        super(namebook, numberpage, text);

    }

    public void PrintText() {
        System.out.printf("Журнал, 100, Союзпечать");
        System.out.println();
    }
}