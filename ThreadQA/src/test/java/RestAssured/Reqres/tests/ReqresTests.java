package RestAssured.Reqres.tests;

import RestAssured.Reqres.api.UserData;
import RestAssured.Reqres.api.UsersList;
import RestAssured.Reqres.spec.Specifications;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class ReqresTests {

    private final static String URL = "https://reqres.in/";

    @Test
    public void checkAvatarAndIdTest(){
        Specifications.installSpecification(Specifications.requestSpec(URL),Specifications.responseSpecOK());
        List<UserData> users = given()
                .when()
                .get("api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        users.stream().forEach(x-> Assertions.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assertions.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));

        List<String> avatars = users.stream().map(UserData::getAvatar).toList();
        List<String> ids = users.stream().map(x->x.getId().toString()).toList();
        for(int i=0;i<avatars.size();i++){
            Assertions.assertTrue(avatars.get(i).contains(ids.get(i)));
        }

    }
}
