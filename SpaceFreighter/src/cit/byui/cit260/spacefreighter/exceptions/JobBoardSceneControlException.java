/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.byui.cit260.spacefreighter.exceptions;

/**
 *
 * @author jaxom
 */
public class JobBoardSceneControlException extends Exception{

    public JobBoardSceneControlException() {
    }

    public JobBoardSceneControlException(String string) {
        super(string);
    }

    public JobBoardSceneControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public JobBoardSceneControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public JobBoardSceneControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
