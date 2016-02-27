/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.GameControl;
import java.util.Scanner;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author jaxom
 */
public class MainMenuView {
    
    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                + "\n-----------------------------"
                + "\n Main Menu                   |"
                + "\n-----------------------------"
                +"\nG – Start new game"
                +"\nH - Help menu"
                +"\nS - Save game"
                +"\nL - load saved game"
                +"\nQ - Exit game"
                +"\n------------------------------";
    }
    
    public void displayMainMenuView() {
        
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
            
        }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
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
    
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.startNewGame();
                break;
            case "H":
                this.helpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            case "L":
                this.loadSavedGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.creatNewGame(SpaceFreighter.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void helpMenu() {
                
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.displayMenu();
       
    }

    private void saveGame() {
        System.out.println("We did it again");
    }

    private void loadSavedGame() {
        System.out.println("We did it again");
    }
}
    
