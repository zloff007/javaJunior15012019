package lesson10;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(12, "as", 23000);

        Lion lion1 = new Lion(2,"Lion1", 10000);
        Lion lion2 = new Lion(11,"Lion2", 11000);
        Lion lion3 = new Lion(14,"Lion3", 12000);

        Dog dog1 = new Dog(4, "Dog1",100);
        Dog dog2 = new Dog(1, "Dog2",300);
        Dog dog3 = new Dog(3, "Dog3",200);

        Animal[] zoo = new Animal[6];
        zoo [0] = dog1;
        zoo [1] = lion2;
        zoo [2] = dog2;
        zoo [3] = lion3;
        zoo [4] = dog3;
        zoo [5] = lion1;

        for ( int i = 0 ; i < zoo.length; i++){
        zoo[i].print();
        }

    }
}
