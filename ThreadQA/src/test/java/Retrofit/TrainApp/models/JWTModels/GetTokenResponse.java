package Retrofit.TrainApp.models.JWTModels;

public class GetTokenResponse {

    private String token;

    public GetTokenResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
