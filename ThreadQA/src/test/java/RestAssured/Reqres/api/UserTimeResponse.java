package RestAssured.Reqres.api;

public class UserTimeResponse extends UserTime{

    public String getUpdatedAt() {
        return updatedAt;
    }

    private String updatedAt;

    public UserTimeResponse(String name, String job,String updatedAt) {
        super(name, job);
        this.updatedAt = updatedAt;
    }
}
