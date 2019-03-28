package lesson11;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMainTitle("Huyndai");
        car.setDatePublic("7 февраля");
        car.setTotalCountViev(733);
        car.setVievToDay(27);
        car.setPrice(715000);

        Photo photo1 = new Photo();
        photo1.setPuthToBigPhoto("www");
        photo1.setPuthToSmallPhoto("www");

        Photo photo2 = new Photo();
        photo2.setPuthToBigPhoto("www");
        photo2.setPuthToSmallPhoto("www");

        Photo photo3 = new Photo();
        photo3.setPuthToBigPhoto("www");
        photo3.setPuthToSmallPhoto("www");

        Photo[] photos = new Photo[3];
        photos [0] = photo1;
        photos [1] = photo2;
        photos [2] = photo3;

        car.setPhotos(photos);

        Reviev reviev = new Reviev("dsgdhghf","шумит","можно покупать",50,10);



    }
}
