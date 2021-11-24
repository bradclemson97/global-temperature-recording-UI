package Model;
//        Brad
  //      2019-09-06
    //    10:24

public interface ErrorMessage {
    /**
     * This method set the error message text to be displayed. It will overwrite any existing
     * messages.
     *
     * @param errorMessage is the text of the message to be displayed
     */
    void setErrorMessage(String errorMessage);

    /**
     * This method will add the error message to the end of any other error messages that already
     * exist in the error text. It should be used when you want to be able to report multiple
     * errors.
     *
     * @param errorMessage is the text of the message to be displayed
     */
    void addErrorMessage(String errorMessage);

    /**
     * This method is called by the interface code when it wants to obtain the error messages
     * that are to be displayed.
     *
     * @return the current error message string
     */
    String getErrorMessage();
}
