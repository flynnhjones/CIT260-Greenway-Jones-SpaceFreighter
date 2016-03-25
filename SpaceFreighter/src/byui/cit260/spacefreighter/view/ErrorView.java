/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import java.io.PrintWriter;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author Daddy
 */
public class ErrorView {
    
    private static final PrintWriter ERRORFILE = SpaceFreighter.getOutFile();
    private static final PrintWriter LOGFILE = SpaceFreighter.getLogFile();
    
    public static void display(String className, String errorMessage) {
        ERRORFILE.println(
                    "---------------------------------------------"
                    + "\n- ERROR - " + errorMessage +
                    "\n---------------------------------------------"
                    );
        
        LOGFILE.println(className + " - " + errorMessage);
    }
}
