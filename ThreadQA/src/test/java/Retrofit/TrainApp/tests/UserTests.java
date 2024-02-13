package Retrofit.TrainApp.tests;

import Retrofit.TrainApp.endpoints.JWTController;
import Retrofit.TrainApp.endpoints.UserController;
import Retrofit.TrainApp.models.JWTModels.GetTokenRequest;
import Retrofit.TrainApp.models.JWTModels.GetTokenResponse;
import Retrofit.TrainApp.models.UserController.UserSignupRequest;
import Retrofit.TrainApp.models.UserController.UserSignupResponse;
import Retrofit.Utils.DataGenerator;
import org.junit.jupiter.api.Test;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class UserTests {
    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://85.192.34.140:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private final UserController userController = retrofit.create(UserController.class);
    private final JWTController jwtController = retrofit.create(JWTController.class);
    DataGenerator dataGenerator = new DataGenerator();


    @Test
    public void testUsersList() throws IOException {
        Response<List<String>> response = userController.getUsersList().execute();
        assertTrue(response.isSuccessful());


        List<String> usersList = response.body();
        assertNotNull(usersList);
        assertTrue(usersList.size() > 5);
    }

    @Test
    public void testGetToken() throws IOException {
        String username = DataGenerator.generateUsername();
        String password = DataGenerator.generatePassword(5);
        UserSignupRequest userSignupRequest = new UserSignupRequest(username,password);
        Response<UserSignupResponse> userResponse = userController.createUser(userSignupRequest).execute();
        assertTrue(userResponse.isSuccessful());
        GetTokenRequest getTokenRequest = new GetTokenRequest(password, username);
        Response<GetTokenResponse> response = jwtController.getToken(getTokenRequest).execute();
        assertTrue(response.isSuccessful());


        GetTokenResponse getTokenResponse = response.body();

        assertTrue(getTokenResponse.getToken() instanceof String);
    }

    @Test
    public void testSignupUser() throws IOException {
        String username = DataGenerator.generateUsername();
        String password = DataGenerator.generatePassword(5);
        UserSignupRequest userSignupRequest = new UserSignupRequest(username,password);
        Response<UserSignupResponse> response = userController.createUser(userSignupRequest).execute();
        assertTrue(response.isSuccessful());


        UserSignupResponse userSignupResponse = response.body();
        assertEquals(userSignupResponse.getRegister_data().getLogin(), userSignupRequest.getLogin());
        assertTrue(userSignupResponse.getInfo().getMessage() instanceof String);
    }


}
