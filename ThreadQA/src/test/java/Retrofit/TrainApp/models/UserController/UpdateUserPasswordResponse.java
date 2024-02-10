package Retrofit.TrainApp.models.UserController;

import Retrofit.TrainApp.models.submodels.Info;

public class UpdateUserPasswordResponse {
    private Info info;


    public UpdateUserPasswordResponse(Info info) {
        this.info = info;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
