package RestAssured.Reqres.api;

public class unSuccessReg {
    public String getError() {
        return error;
    }

    private String error;

    public unSuccessReg(String error) {
        this.error = error;
    }
}
