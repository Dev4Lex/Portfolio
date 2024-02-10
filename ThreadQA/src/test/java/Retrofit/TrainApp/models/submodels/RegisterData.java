package Retrofit.TrainApp.models.submodels;

import java.util.ArrayList;

public class RegisterData {

    private int id;
    private String login;
    private String pass;
    private ArrayList<Object> games;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<Object> getGames() {
        return games;
    }

    public void setGames(ArrayList<Object> games) {
        this.games = games;
    }

    public RegisterData(int id, String login, String pass, ArrayList<Object> games) {
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.games = games;
    }


}
