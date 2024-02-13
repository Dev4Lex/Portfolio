package RestAssured.Reqres.api.registration;

public class SuccessReg {
    public SuccessReg(Integer id, String token) {
        this.id = id;
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }

    private Integer id;
    private String token;
}
