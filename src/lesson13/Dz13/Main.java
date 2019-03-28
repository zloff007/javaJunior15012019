package lesson13.Dz13;

public class Main extends BooCase implements BookInterface{
    public Main() {
    }

    public static void main(String[] args) {

        Book book = new Book();
        Notebook notebook = new Notebook();
        Magazine magazine = new Magazine();

        BooCase[] carrier = new BooCase[3];

        carrier[0] = book;
        carrier[1] = magazine;
        carrier[2] = notebook;

        for(int i = 0; i < carrier.length; i++){
            carrier[i].PrintText();
        }






    }
}
