package Retrofit.TrainApp.models.submodels;

public class Requirements {

    private int hardDrive;
    private String osName;
    private int ramGb;
    private String videoCard;

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public int getRamGb() {
        return ramGb;
    }

    public void setRamGb(int ramGb) {
        this.ramGb = ramGb;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }



    public Requirements(int hardDrive, String osName, int ramGb, String videoCard) {
        this.hardDrive = hardDrive;
        this.osName = osName;
        this.ramGb = ramGb;
        this.videoCard = videoCard;
    }
}
