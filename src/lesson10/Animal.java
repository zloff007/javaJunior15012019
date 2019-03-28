package lesson10;

public class Animal {

    private int age;
    private String name;
    private  int price;

    public Animal() {
    }

    public Animal(int age, String name, int price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print (){
        System.out.printf("Животное: Имя - %s, цена - %d, возраст - %d ", this.name , this.price, this.age);
    }
}
