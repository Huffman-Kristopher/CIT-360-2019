/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller;

/**
 *
 * @author Kristopher Huffman
 */
public class MathCalcControlException extends Exception {

    public MathCalcControlException() {
    }

    public MathCalcControlException(String message) {
        super(message);
    }

    public MathCalcControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public MathCalcControlException(Throwable cause) {
        super(cause);
    }

    public MathCalcControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
}
}
