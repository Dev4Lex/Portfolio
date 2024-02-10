package Retrofit.TrainApp.models.submodels;

public class DLCS {

    private String description;
    private String dlcName;
    private boolean isDlcFree;
    private int price;
    private int rating;
    private SimilarDlc similarDlc;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDlcName() {
        return dlcName;
    }

    public void setDlcName(String dlcName) {
        this.dlcName = dlcName;
    }

    public boolean isDlcFree() {
        return isDlcFree;
    }

    public void setDlcFree(boolean dlcFree) {
        isDlcFree = dlcFree;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public SimilarDlc getSimilarDlc() {
        return similarDlc;
    }

    public void setSimilarDlc(SimilarDlc similarDlc) {
        this.similarDlc = similarDlc;
    }

    public DLCS(String description, String dlcName, boolean isDlcFree, int price, int rating, SimilarDlc similarDlc) {
        this.description = description;
        this.dlcName = dlcName;
        this.isDlcFree = isDlcFree;
        this.price = price;
        this.rating = rating;
        this.similarDlc = similarDlc;
    }
}
