/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.GameControl;
import byui.cit260.spacefreighter.model.Player;
import java.util.Scanner;

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
    public void displayStartProgramView() {
    
        boolean done = false; 
        do{
            
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
            return;
        
            done = this.doAction(playersName);
        
        } while (!done);
        
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1){
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break;
        }
    
        return value;
    }
    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid player name: "
                    + "The name must be greater than one character in lenght");
            return false;
        }
    
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
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
