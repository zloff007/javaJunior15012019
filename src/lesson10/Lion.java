package lesson10;

public class Lion extends Animal {
    public Lion(){
        super();
    }

    public Lion(int age, String name, int price){
//        setAge(age);
//        setPrice(price);
//        setName(name);
        super(age,name,price);

    }

    @Override
    public void print() {
        super.print();

        System.out.printf( "Лев: Имя - %s, цена - %d, возраст - %d ", this.getName() , this.getPrice(), this.getAge());
        System.out.println();
    }

}
