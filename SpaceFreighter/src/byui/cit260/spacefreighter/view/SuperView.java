/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author Daddy
 */
public abstract class SuperView implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = SpaceFreighter.getInFile();
    protected final PrintWriter console = SpaceFreighter.getOutFile();
    
    public SuperView() {
        
    }
    
    public SuperView(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
    
        boolean done = false; 
        do{
            
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
            return;
        
            done = this.doAction(value);
        
        } while (!done); 
        
    }
    
    @Override
    public String getInput() {
        
        String value = null;
        boolean valid = false;
        
        while (!valid) {
            try {
                this.console.println("\n" + this.displayMessage);
                
                value = this.keyboard.readLine();
                value = value.trim();
                
                if (value.length() < 1){
                    this.console.println("\nInvalid value: value can not be blank");
                    continue;
                }
                
                break;
            } catch (IOException ex) {
                Logger.getLogger(SuperView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        return value;
    }
}
