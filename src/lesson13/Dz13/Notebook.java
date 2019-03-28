package lesson13.Dz13;

public class Notebook extends BooCase {
    public Notebook() {
    }

    public Notebook(String namebook, int numberpage, String text) {
        super(namebook, numberpage, text);

    }

    public void PrintText (){
        System.out.printf("Блокнот, 300, СоюзИздат");
        System.out.println();
    }
}
