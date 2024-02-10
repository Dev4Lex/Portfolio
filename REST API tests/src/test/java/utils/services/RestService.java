package utils.services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.specification.RequestSpecification;

// Спецификация запроса с базовыми урлами, куки, конструктор для инициализации
public abstract class RestService {
    private static final String BASE_URL = "https://reqres.in/api";
    protected Cookies cookies;
    protected RequestSpecification REQ_SPEC;

    // Абстрактный метод без реализации, только сигнатура функции
    protected abstract String getBasePath();

    public RestService(Cookies cookies){
        this.cookies = cookies;

        REQ_SPEC = new RequestSpecBuilder()
                .addCookies(cookies)
                .setBaseUri(BASE_URL)
                .setBasePath(getBasePath())
                .setContentType(ContentType.JSON)
                .build();
    }
}
