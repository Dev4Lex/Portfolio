/**
 * RestTest
 * @author alexs
 * @since 10.11.2021 01:03
 */

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;


import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class RestTest {

    @Test
    public void getUsers(){
        List<String> emails = given()
                .baseUri("https://reqres.in/api")
                .basePath("/users")
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .statusCode(200)
                .extract().jsonPath().getList("data.email");
    }

}
