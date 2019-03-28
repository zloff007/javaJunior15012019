package lesson11;

public class Reviev {

    private String textPlus;
    private String textMinus;
    private String reviev;
    private int like;
    private int dislike;

    public Reviev() {
    }

    public Reviev(String textPlus, String textMinus, String reviev, int like, int dislike) {
        this.textPlus = textPlus;
        this.textMinus = textMinus;
        this.reviev = reviev;
        this.like = like;
        this.dislike = dislike;
    }

    public String getTextPlus() {
        return textPlus;
    }

    public void setTextPlus(String textPlus) {
        this.textPlus = textPlus;
    }

    public String getTextMinus() {
        return textMinus;
    }

    public void setTextMinus(String textMinus) {
        this.textMinus = textMinus;
    }

    public String getReviev() {
        return reviev;
    }

    public void setReviev(String reviev) {
        this.reviev = reviev;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }
}
