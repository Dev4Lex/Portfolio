package RestAssured.Reqres.api;

public class UserTime {
    public UserTime(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    private String name;
    private String job;
}
