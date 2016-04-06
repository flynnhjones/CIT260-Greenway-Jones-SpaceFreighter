/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.GameControl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author jaxom
 */
public class MainMenuView extends SuperView {
    
        
    public MainMenuView() {
        super("\n"
                + "\n-----------------------------"
                + "\n Main Menu                   |"
                + "\n-----------------------------"
                +"\nG – Start new game"
                +"\nH - Help menu"                
                +"\nL - Load saved game"
                +"\nQ - Exit game"
                +"\n-----------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "G":
                this.startNewGame();
                break;
            case "H":
                this.helpMenu();
                break;            
            case "L":
        {
            try {
                this.loadSavedGame();
            } catch (IOException ex) {
                ErrorView.display("Main Menu load saved game", ex.getMessage());
            }
        }
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.creatNewGame(SpaceFreighter.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void helpMenu() {
                
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.display();
       
    }    

    private void loadSavedGame() throws IOException {
        this.console.println("Enter name of saved file.");
        
        String filePath = this.keyboard.readLine();
        
        try {
            GameControl.getSavedGame(filePath);
        }
        catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        this.console.println("You're Loaded! Good job!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
    
