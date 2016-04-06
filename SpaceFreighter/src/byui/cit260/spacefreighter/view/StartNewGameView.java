/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.GameControl;
import byui.cit260.spacefreighter.model.Player;
import cit.byui.cit260.spacefreighter.exceptions.GameControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author jaxom
 */
public class StartNewGameView {
    
    private final String promptMessage;
    PrintWriter console = SpaceFreighter.getOutFile();

    public StartNewGameView() {
        
        this.promptMessage = "\nPlease enter your name: ";
    }

    /**
     * display the start program view
     * @throws cit.byui.cit260.spacefreighter.exceptions.GameControlException
     * @throws java.io.IOException
     */
    public void displayStartNewGameView() throws GameControlException, IOException {
    
        String playersName = null;
        
        boolean done = false; 
        do{
            
          try{ playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
            return;
          } catch (GameControlException ex) {
              ErrorView.display("displayStartProgramView, getPlayerName", ex.getMessage());
                      this.getPlayersName();
          }
        
        try {
                done = this.doAction(playersName);
            } catch (GameControlException ex) {
                ErrorView.display("displayStartProgramView, doAction", ex.getMessage());
            }
        
        } while (!done);
        
    }

    private String getPlayersName() throws GameControlException, IOException {
        BufferedReader keyboard = SpaceFreighter.getInFile();
        String value;
        
        
        
            this.console.println("\n" + this.promptMessage);
            
            value = keyboard.readLine();
            value = value.trim();
            
            if (value.length() < 1){
               throw new GameControlException("\nYour name connot be blank!");                   
            
            
        }
    
        return value;
    }
    private boolean doAction(String playersName) throws GameControlException {
        
        if (playersName.length() < 2) {
            throw new GameControlException("\nYour name connot less then two characters!");
        }
    
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            throw new GameControlException("\nYour name connot be blank!");
        }  
            
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        this.console.println("\n==============================================="
                           + "\n Welcome to the game " + player.getPlayerName()
                           + "\n We hope you have a lot of fun!!"
                           + "\n==============================================="
                            );
        
        GameMenuView gameMenuView = new GameMenuView();
                
        gameMenuView.display();
    }
}
