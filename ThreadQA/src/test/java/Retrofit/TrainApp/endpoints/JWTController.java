package Retrofit.TrainApp.endpoints;

import Retrofit.TrainApp.models.JWTModels.GetTokenRequest;
import Retrofit.TrainApp.models.JWTModels.GetTokenResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface JWTController {
    @Headers({"accept: */*", "Content-Type: application/json"})
    @POST("api/login")
    Call<GetTokenResponse> getToken(@Body GetTokenRequest getTokenRequest);
}
