package Retrofit.TrainApp.endpoints;

import Retrofit.TrainApp.models.UserController.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface UserController {

    @Headers("accept: application/json")

    @POST("api/signup")
    Call<UserSignupResponse> createUser(@Body UserSignupRequest userSignupRequest);

    @PUT("api/user")
    Call<UserSignupResponse> updateUserPassword(@Body UpdateUserPasswordRequest updateUserPasswordRequest);

    @GET("api/users")
    Call<List<String>> getUsersList();

    @GET("api/user")
    Call<SingleUserResponse> getUser(@Header("Authorization: Bearer ") String jwt);

    @DELETE("api/user")
    Call<DeleteUserResponse> deleteUser(@Header("Authorization: Bearer ") String jwt);

}

