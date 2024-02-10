package Retrofit.TrainApp.models.submodels;

import java.util.ArrayList;
import java.util.Date;

public class Games {

    private String company;
    private String description;
    private ArrayList<DLCS> dlcs;
    public int gameId;
    private String genre;
    private boolean isFree;
    private int price;
    private Date publish_date;
    private int rating;
    private boolean requiredAge;
    private Requirements requirements;
    private ArrayList<String> tags;
    private String title;


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<DLCS> getDlcs() {
        return dlcs;
    }

    public void setDlcs(ArrayList<DLCS> dlcs) {
        this.dlcs = dlcs;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isRequiredAge() {
        return requiredAge;
    }

    public void setRequiredAge(boolean requiredAge) {
        this.requiredAge = requiredAge;
    }

    public Requirements getRequirements() {
        return requirements;
    }

    public void setRequirements(Requirements requirements) {
        this.requirements = requirements;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Games(String company, String description, ArrayList<DLCS> dlcs, int gameId, String genre, boolean isFree, int price, Date publish_date, int rating, boolean requiredAge, Requirements requirements, ArrayList<String> tags, String title) {
        this.company = company;
        this.description = description;
        this.dlcs = dlcs;
        this.gameId = gameId;
        this.genre = genre;
        this.isFree = isFree;
        this.price = price;
        this.publish_date = publish_date;
        this.rating = rating;
        this.requiredAge = requiredAge;
        this.requirements = requirements;
        this.tags = tags;
        this.title = title;
    }
}
