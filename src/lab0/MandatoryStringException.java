/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author aferit
 */
public class MandatoryStringException extends IllegalArgumentException{
    
    
    private final static String msg = "method argument is mandatory";

    public MandatoryStringException() {
        super(msg);
    }

    public MandatoryStringException(String s) {
        super(msg);
    }

    public MandatoryStringException(String message, Throwable cause) {
        super(msg, cause);
    }

    public MandatoryStringException(Throwable cause) {
        super(cause);
    }
    
    
}
