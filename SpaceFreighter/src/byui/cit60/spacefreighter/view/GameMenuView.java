/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit60.spacefreighter.view;

import java.util.Scanner;

/**
 *
 * @author jaxom
 */
public class GameMenuView {
    
    private String menu;

    public GameMenuView() {
        this.menu = "\n"
                + "\n-----------------------------"
                + "\n Game Menu                   |"
                + "\n-----------------------------"
                +"\nI – Inventory/Currency"
                +"\nJ – Jobs board"
                +"\nL – Map/Location chooser"
                +"\nS – Ship menu"
                +"\nC – Character customization menu"
                +"\nX – Shop menu"
                +"\nH – Help menu"
                +"\nZ – Save game"
                +"\nQ – Quit to main menu"
                +"\n------------------------------";
    }
    
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "I":
                this.inventoryCurrency();
                break;
            case "J":
                this.jobBoard();
                break;
            case "L":
                this.MapLocation();
                break;
            case "S":
                this.shipMenu();
                break;
            case "C":
                this.characterCustomMenu();
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
      System.out.println("We did it again");  
    }

    private void jobBoard() {
      System.out.println("We did it again");  
    }

    private void MapLocation() {
      System.out.println("We did it again");
    }

    private void shipMenu() {
        System.out.println("We did it again");
    }

    private void characterCustomMenu() {
        System.out.println("We did it again");
    }

    private void shopMenu() {
        System.out.println("We did it again");
    }

    private void helpMenu() {
      System.out.println("We did it again");  
    }

    private void saveGame() {
       System.out.println("We did it again"); 
    }

        public void displayMenu() {
        
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
}