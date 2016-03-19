/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.byui.cit260.spacefreighter.exceptions;

/**
 *
 * @author Daddy
 */
public class SpaceShipControlException extends Exception{

    public SpaceShipControlException() {
    }

    public SpaceShipControlException(String message) {
        super(message);
    }

    public SpaceShipControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public SpaceShipControlException(Throwable cause) {
        super(cause);
    }

    public SpaceShipControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
