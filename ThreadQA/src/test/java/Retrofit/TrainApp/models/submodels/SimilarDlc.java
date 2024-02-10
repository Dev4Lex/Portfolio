package Retrofit.TrainApp.models.submodels;

public class SimilarDlc {

    private String dlcNameFromAnotherGame;
    private boolean isFree;


    public SimilarDlc(String dlcNameFromAnotherGame, boolean isFree) {
        this.dlcNameFromAnotherGame = dlcNameFromAnotherGame;
        this.isFree = isFree;
    }

    public String getDlcNameFromAnotherGame() {
        return dlcNameFromAnotherGame;
    }

    public void setDlcNameFromAnotherGame(String dlcNameFromAnotherGame) {
        this.dlcNameFromAnotherGame = dlcNameFromAnotherGame;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }


}
