import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import pojos.UserPojo;
import pojos.UserPojoFull;


import java.util.List;

import static io.restassured.RestAssured.given;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RestTest {

    @Test
    public void getUsers(){
        List<UserPojoFull> users = given()
                .baseUri("https://reqres.in/api")
                .basePath("/users")
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .statusCode(200)
                .extract().jsonPath().getList("data", UserPojoFull.class);

        assertThat(users).extracting(UserPojoFull::getEmail).contains("george.bluth@reqres.in");
    }
}
