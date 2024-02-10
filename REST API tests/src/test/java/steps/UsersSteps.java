package steps;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojos.CreateUserResponse;
import pojos.UserPojoFull;
import pojos.UserRequest;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UsersSteps {

    // Методы, описывающие бизнес-действия

    // Спецификация с помощью RequestSpecBuilder
    private static final RequestSpecification REQ_SPEC =
            new RequestSpecBuilder()
                    .setBaseUri("https://reqres.in/api")
                    .setBasePath("/users")
                    .setContentType(ContentType.JSON)
                    .build();
    // Создаем локальную переменную, в которую метод createUser будет сохранять результат
    private CreateUserResponse user;
    public CreateUserResponse createUser(UserRequest rq){
        user = given().spec(REQ_SPEC).body(rq).post().as(CreateUserResponse.class);
        return user;
    }


    //Метод возвращает значение последнего созданного user
    public UserPojoFull getUser() {
        return given().spec(REQ_SPEC).get("/" + user.getId()).as(UserPojoFull.class);
    }

    // Метод возвращает список пользователей в виде объектов, соответствующих pojo-классу
    public static List<UserPojoFull> getUsers(){
        return given().spec(REQ_SPEC)
                .get()
                .jsonPath().getList("data", UserPojoFull.class);
    }

    // Метод возвращает значение последнего созданного пользователя
    public static UserPojoFull getUser(int id) {
        return given().spec(REQ_SPEC).get("/" + id).as(UserPojoFull.class);
    }
}