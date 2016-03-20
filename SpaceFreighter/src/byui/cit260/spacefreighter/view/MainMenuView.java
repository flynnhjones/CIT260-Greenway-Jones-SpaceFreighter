/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.GameControl;
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
                +"\nS - Save game"
                +"\nL - load saved game"
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
        gameMenu.display();
    }

    private void helpMenu() {
                
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.display();
       
    }

    private void saveGame() {
        System.out.println("Save Game Menu call works - BUT NOT YET DESIGNED");
    }

    private void loadSavedGame() {
        System.out.println("Load Game Menu call works - BUT NOT YET DESIGNED");
    }
}
    
