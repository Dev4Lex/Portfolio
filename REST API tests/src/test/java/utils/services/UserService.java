package utils.services;

import io.restassured.http.Cookies;
import pojos.SingleUser;
import pojos.UserRequest;
import pojos.CreateUserResponse;
import pojos.UserPojoFull;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserService extends RestService{

    //Реализация метода с возвратом базового пути до конкретного api
    @Override
    protected String getBasePath() {
        return "/users";
    }

    public UserService(Cookies cookies) {
        super(cookies);
    }

    public CreateUserResponse createUser(UserRequest rq) {
        return given().spec(REQ_SPEC).body(rq).post().as(CreateUserResponse.class);
    }

    public List<UserPojoFull> getUsers() {
        return given().spec(REQ_SPEC)
                .get("?page=2")
                .jsonPath().getList("data", UserPojoFull.class);
    }

    public String getUser() {
        return given().spec(REQ_SPEC)
                .get("/2")
                .jsonPath().getJsonObject("data.email");
    }
}
