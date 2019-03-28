package lesson12;

public class Shofer implements Father, Emploer {
    @Override
    public void getSallary() {
        System.out.println("Я шофер, получаю 40000 руб");

    }

    @Override
    public void doWork() {

        System.out.println("Я шофер, и я еду");

    }

    @Override
    public void otvestiRebenkaVSad() {

        System.out.println("Я шофер, и я еду");

    }

    @Override
    public void takeChildrenFromSad() {

        System.out.println("Я шофер, и я еду");

    }


}
