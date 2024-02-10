package utils;

import pojos.UserRequest;

public class UserGenerator {

    // Создание пользователя в генераторе для переиспользования в разных тестах
    public static UserRequest getSimpleUser(){
        return UserRequest.builder()
                .name("Alex")
                .job("QA Engineer")
                .build();
    }
}
