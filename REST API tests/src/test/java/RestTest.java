import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import pojos.CreateUserRequest;
import pojos.CreateUserResponse;
import pojos.UserPojo;
import pojos.UserPojoFull;


import java.util.List;

import static io.restassured.RestAssured.given;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RestTest {

    private static final RequestSpecification REQ_SPEC =
            new RequestSpecBuilder()
                    .setBaseUri("https://reqres.in/api")
                    .setBasePath("/users")
                    .setContentType(ContentType.JSON)
                    .build();

    @Test
    public void getUsers(){
        List<UserPojoFull> users = given()
                .spec(REQ_SPEC)
                .when().get()
                .then()
                .statusCode(200)
                .extract().jsonPath().getList("data", UserPojoFull.class);

        assertThat(users).extracting(UserPojoFull::getEmail).contains("george.bluth@reqres.in");
    }
    @Test public void createUser(){
        CreateUserRequest rq = new CreateUserRequest();
        rq.setName("Alex");
        rq.setJob("QA Engineer");

        CreateUserResponse rs = given()
                .spec(REQ_SPEC)
                .body(rq)
                .when().post()
                .then().extract().as(CreateUserResponse.class);

        assertThat(rs)
                .isNotNull()
                .extracting(CreateUserResponse::getName)
                .isEqualTo(rq.getName());

    }
}
