package lesson13.Dz13;

abstract class BooCase implements BookInterface{

    private String namebook;
    private int numberpage;
    private String text;

    public BooCase() {
    }

    public BooCase(String namebook, int numberpage, String text) {
        this.namebook = namebook;
        this.numberpage = numberpage;
        this.text = text;
    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public int getNumberpage() {
        return numberpage;
    }

    public void setNumberpage(int numberpage) {
        this.numberpage = numberpage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public void PrintNamebook() {

    }

    @Override
    public void PrintNumberpage() {

    }

    @Override
    public void PrintText() {

    }


}

