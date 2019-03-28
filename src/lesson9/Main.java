package lesson9;

public class Main {

    public static void main(String[] args) {

       Student vasya = new Student();
       Student petya = new Student();


       double rezult = vasya.perimetr(2,4,7);


       vasya.setName("Vasya");
       petya.setName("Petya !!!");
       vasya.setAge(44);
       petya.setAge(22);

       vasya.setSername("Pupkin");
       petya.setSername("Bupkin");

       System.out.println(petya.getName());
       System.out.println(vasya.getName());
    }


}
