package lesson10.Dz10;

public class Auto {

    private String name;
    private int  date;
    private String  model;
    private int  namber;
    private int price;

    public Auto(){

    }

    public Auto(String name, int date, String model, int namber, int price) {
        this.name = name;
        this.date = date;
        this.model = model;
        this.namber = namber;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNamber() {
        return namber;
    }

    public void setNamber(int namber) {
        this.namber = namber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print(){
        System.out.printf("Машина: Марка - %s, Год выпуска - %d, Модель - %s , Номер - %d , Цена - %d ", this.name,this.date,this.model,this.namber,this.price);
        System.out.println();
    }

}
