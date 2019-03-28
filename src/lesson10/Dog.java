package lesson10;

public class Dog extends Animal{

    public Dog(){

    }
    public Dog(int age, String name, int price){
        super(age, name, price);
    }

    public void print (){
        System.out.printf("Собака: Имя - %s, цена - %d, возраст - %d ", this.getName() , this.getPrice(), this.getAge());
    }
}



