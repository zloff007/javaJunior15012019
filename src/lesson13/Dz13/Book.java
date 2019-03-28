package lesson13.Dz13;

public class Book extends BooCase {
    public Book() {

    }

    public Book (String namebook, int numberpage, String text) {
        super(namebook, numberpage, text);

    }
    public void PrintText (){
        System.out.printf("Идиот, 520, Достоевский");
        System.out.println();


    }

}

