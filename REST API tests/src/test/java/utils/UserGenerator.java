package utils;

import pojos.CreateUserRequest;
import pojos.CreateUserResponse;

public class UserGenerator {

    public static CreateUserRequest getSimpleUser(){
        return CreateUserRequest.builder()
                .name("Alex")
                .job("QA Engineer")
                .build();
    }
}
