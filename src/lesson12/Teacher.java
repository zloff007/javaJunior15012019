package lesson12;

public class Teacher implements Emploer {

    @Override
    public void getSallary() {

        System.out.println("Я учитель, получаю 20000 руб");

    }

    @Override
    public void doWork() {
        System.out.println("Я учитель, учу детей");

    }
}
