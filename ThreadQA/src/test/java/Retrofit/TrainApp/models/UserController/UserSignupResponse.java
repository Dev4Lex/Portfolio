package Retrofit.TrainApp.models.UserController;

import Retrofit.TrainApp.models.submodels.Info;
import Retrofit.TrainApp.models.submodels.RegisterData;

public class UserSignupResponse {

    private RegisterData register_data;
    private Info info;


    public UserSignupResponse(RegisterData register_data, Info info) {
        this.register_data = register_data;
        this.info = info;
    }

    public RegisterData getRegister_data() {
        return register_data;
    }

    public void setRegister_data(RegisterData register_data) {
        this.register_data = register_data;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }


}
