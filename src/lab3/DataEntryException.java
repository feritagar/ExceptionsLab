/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author FA
 */
public class DataEntryException extends IllegalArgumentException {

    private static final String MESSAGE = "Missing or invalid data. "
            + "Please make sure you follow introduction when you enter information";

    public DataEntryException() {
        super(MESSAGE);
    }

    public DataEntryException(String s) {
        super(MESSAGE);
    }

    public DataEntryException(String message, Throwable cause) {
        super(MESSAGE, cause);
    }

    public DataEntryException(Throwable cause) {
        super(cause);
    }

}
