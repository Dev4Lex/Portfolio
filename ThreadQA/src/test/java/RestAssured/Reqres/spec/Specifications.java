package RestAssured.Reqres.spec;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.http.*;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.*;
import io.restassured.builder.RequestSpecBuilder;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.security.KeyStore;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Specifications {
    public static RequestSpecification requestSpec(String url) {
        return new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(ContentType.JSON)
                .build();
        }
        public static ResponseSpecification responseSpecOK(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
        }
    public static ResponseSpecification responseSpecError400(){
        return new ResponseSpecBuilder()
                .expectStatusCode(400)
                .build();
    }

        public  static void installSpecification(RequestSpecification request,ResponseSpecification response){
            RestAssured.requestSpecification = request;
            RestAssured.responseSpecification = response;
        }
    }