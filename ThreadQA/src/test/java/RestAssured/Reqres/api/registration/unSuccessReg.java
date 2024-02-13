package RestAssured.Reqres.api.registration;

public class unSuccessReg {
    public String getError() {
        return error;
    }

    private String error;

    public unSuccessReg(String error) {
        this.error = error;
    }
}
