package Retrofit.TrainApp.models.UserController;

public class UserSignupRequest {

    private String login;
    private String pass;

    public UserSignupRequest(String login, String pass) {
        this.login = login;
        this.pass = pass;
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
