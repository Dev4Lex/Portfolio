package RestAssured.Reqres.api;

public class Register {
    public Register(String email, String password) {
        this.email = email;
        this.password = password;
    }

    private String email;
    private String password;
}
