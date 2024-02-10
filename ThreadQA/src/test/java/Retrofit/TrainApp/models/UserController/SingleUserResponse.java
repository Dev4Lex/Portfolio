package Retrofit.TrainApp.models.UserController;

import Retrofit.TrainApp.models.submodels.Games;

import java.util.ArrayList;

public class SingleUserResponse {

    private ArrayList<Games> games;
    private int id;
    private String login;
    private String pass;

    public SingleUserResponse(ArrayList<Games> games, int id, String login, String pass) {
        this.games = games;
        this.id = id;
        this.login = login;
        this.pass = pass;
    }


    public ArrayList<Games> getGames() {
        return games;
    }

    public void setGames(ArrayList<Games> games) {
        this.games = games;
    }

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
}
