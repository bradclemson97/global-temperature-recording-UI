package Model;
//        Brad
  //      2019-09-06
    //    14:05

public class Error {
    private String errorMessage = "";

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


    public void addErrorMessage(String errorMessage) {
        this.errorMessage += (this.errorMessage.length() == 0 ? "" : "\n") + errorMessage;
    }


    public String getErrorMessage() {
        return errorMessage;
    }
}

