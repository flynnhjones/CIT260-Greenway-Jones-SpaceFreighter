/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.GameControl;
import byui.cit260.spacefreighter.model.Player;
import cit.byui.cit260.spacefreighter.exceptions.GameControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaxom
 */
public class StartProgramView {
    
    private String promptMessage;

    public StartProgramView() {
        
        this.displayBanner();
        this.promptMessage = "\nPlease enter your name: ";
    }

    private void displayBanner() {
        
        System.out.println(
            "\n**********************************************************************************"
            +"\n*This game you will be playing a captain. You have come into possession          *"
            +"\n*of a spaceship, or most of a ship, and it will be! Once you                     *"
            +"\n*have acquired the parts and pieces.                                             *"
            +"\n*You will first be seeking jobs on the current planet to earn some parts or      *"
            +"\n*currency, to pay for the necessary parts, to get your ship at least             *"
            +"\n*flight worthy.                                                                  *"
            +"\n*You will be able to hone your ship and crew skills in areas of your choosing.   *"
            +"\n*Your first goal is to get your space ship flight worthy. The next, is to build  *"
            +"\n*your currency to a set amount to be able to retire very wealthy.                *"
            +"\n*                                                                                *"
            +"\n**********************************************************************************"
        );
    }
    /**
     * display the start program view
     */
    public void displayStartProgramView() throws GameControlException {
    
        boolean done = false; 
        do{
            
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
            return;
        
        try {
                done = this.doAction(playersName);
            } catch (GameControlException ex) {
                System.out.println(ex.getMessage());
            }
        
        } while (!done);
        
    }

    private String getPlayersName() throws GameControlException {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1){
               throw new GameControlException("\nYour name connot be blank!");
            }
            
            break;
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
        System.out.println("\n==============================================="
                           + "\n Welcome to the game " + player.getPlayerName()
                           + "\n We hope you have a lot of fun!!"
                           + "\n==============================================="
                            );
        
        MainMenuView mainMenuView = new MainMenuView();
                
        mainMenuView.display();
    }
}
