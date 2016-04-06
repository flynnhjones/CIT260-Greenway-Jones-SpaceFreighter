/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.GameControl;
import cit.byui.cit260.spacefreighter.exceptions.GameControlException;
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
                + "\n*----------------------*"
                + "\n|       Main Menu      |"
                + "\n|----------------------|"
                +"\n| G – Start new game   |"
                +"\n| H - Help menu        |"                
                +"\n| L - Load saved game  |"
                +"\n| Q - Exit game        |"
                +"\n*----------------------*");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "G":
        {
            try {
                this.startNewGame();
            } catch (GameControlException | IOException ex) {
                ErrorView.display("Main Menu", ex.getMessage());
            }
        }
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
                MainMenuView.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    public void startNewGame() throws GameControlException, IOException {
        GameControl.creatNewGame(SpaceFreighter.getPlayer());
        
        StartNewGameView startNewGameView = new StartNewGameView();
        startNewGameView.displayStartNewGameView();
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
    
