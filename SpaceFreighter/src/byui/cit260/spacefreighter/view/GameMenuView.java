/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import java.util.Scanner;

/**
 *
 * @author jaxom
 */
public class GameMenuView extends SuperView {
    
    
    public GameMenuView() {
        super("\n"
                + "\n-----------------------------"
                + "\n Game Menu                   |"
                + "\n-----------------------------"
                +"\nI – Inventory/Currency"
                +"\nL – Map/Location chooser"
                +"\nS – Ship menu"
                +"\nX – Shop menu"
                +"\nH – Help menu"
                +"\nZ – Save game"
                +"\nQ – Quit to main menu"
                +"\n------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "I":
                this.inventoryCurrency();
                break;
            case "L":
                this.MapLocation();
                break;
            case "S":
                this.shipMenu();
                break;
            case "X":
                this.shopMenu();
                break;
            case "H":
                this.helpMenu();
                break;
            case "Z":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
}

    private void inventoryCurrency() {
      System.out.println("Inventory/Currency Menu call works - BUT NOT YET DESIGNED");  
    }

    private void MapLocation() {
      System.out.println("Map Location Menu call works - BUT NOT YET DESIGNED");
    }

    private void shipMenu() {
       ShipMenuView shipMenu = new ShipMenuView();
        shipMenu.display();
    }

    private void shopMenu() {
        System.out.println("Shop Menu call works - BUT NOT YET DESIGNED");
    }

    private void helpMenu() {
      HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.display();  
    }

    private void saveGame() {
       System.out.println("Save Game Menu call works - BUT NOT YET DESIGNED");
    }
}