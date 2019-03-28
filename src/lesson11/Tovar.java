package lesson11;

public class Tovar {

    private  String mainTitle;
    private  String datePublic;
    private int totalCountViev;
    private int vievToDay;
    private int price;
    private Photo[] photos = new Photo[10];
    private String mainText;
    private Reviev[] revievs = new Reviev[100];


    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getDatePublic() {
        return datePublic;
    }

    public void setDatePublic(String datePublic) {
        this.datePublic = datePublic;
    }

    public int getTotalCountViev() {
        return totalCountViev;
    }

    public void setTotalCountViev(int totalCountViev) {
        this.totalCountViev = totalCountViev;
    }

    public int getVievToDay() {
        return vievToDay;
    }

    public void setVievToDay(int vievToDay) {
        this.vievToDay = vievToDay;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public Reviev[] getRevievs() {
        return revievs;
    }

    public void setRevievs(Reviev[] revievs) {
        this.revievs = revievs;
    }
}
