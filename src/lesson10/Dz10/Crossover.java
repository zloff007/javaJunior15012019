package lesson10.Dz10;

public class Crossover extends Auto{
    public Crossover(){
        super();
    }

    public Crossover (String name, int date, String model, int namber, int price){
        super(name,date,model,namber,price);
    }

    @Override
    public void print() {
    super.print();

    System.out.printf("Кроссовер: Марка %s , Год выпуска %d, Модель %s , Номер %d , Цена %d", this.getName(),this.getDate(),this.getModel(),this.getNamber(),this.getPrice());
    System.out.println();
    }

}
