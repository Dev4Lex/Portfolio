import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import pojos.CreateUserRequest;
import pojos.CreateUserResponse;
import pojos.UserPojo;
import pojos.UserPojoFull;
import steps.UsersSteps;


import java.util.List;

import static io.restassured.RestAssured.given;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RestTest {



    @Test
    public void getUsers(){
        List<UserPojoFull> users = UsersSteps.getUsers();
        assertThat(users).extracting(UserPojoFull::getEmail).contains("george.bluth@reqres.in");
    }
    @Test public void createUser(){
        CreateUserRequest rq =
                CreateUserRequest.builder()
                .name("Alex")
                .job("QA Engineer")
                .build();

        UsersSteps userApi = new UsersSteps();
        CreateUserResponse rs = userApi.createUser(rq);

        assertThat(rs)
                .isNotNull()
                .extracting(CreateUserResponse::getName)
                .isEqualTo(rq.getName());

    }
}
