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
public class ShipMenuView {
    
    private String menu;
    
    public ShipMenuView() {
        this.menu = "\n"
                + "\n-----------------------------"
                + "\n Ship Menu                   |"
                + "\n-----------------------------"
                +"\nR - Repair damaged ship"
                +"\nU – Upgrade the ships Components"
                +"\nF – Refuel the ship"
                +"\nJ – Check out the Job Board"
                +"\nT – Training room"
                +"\nB – Back to game menu"
                +"\nQ – Quit to main menu"
                +"\n------------------------------";
    }
    
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "R":
                this.repairTheShipMenu();
                break;
            case "U":
                this.upgradeTheShipMenu();
                break;
            case "F":
                this.refuelTheShipMenu();
                break;
            case "J":
                this.jobBoardMenu();
                break;
            case "T":
                this.trainingRoomMenu();
                break;
            case "B":
                this.backToGameMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
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

    private void repairTheShipMenu() {
        System.out.println(" Repair Menu call works - BUT NOT YET DESIGNED");
    }

    private void upgradeTheShipMenu() {
        System.out.println("Upgrade Ship Menu call works - BUT NOT YET DESIGNED");
    }

    private void jobBoardMenu() {
       System.out.println("Job Board Menu call works - BUT NOT YET DESIGNED"); 
    }

    private void trainingRoomMenu() {
       System.out.println("Training Room Menu call works - BUT NOT YET DESIGNED");
    }
    
    private void refuelTheShipMenu() {
       System.out.println("Menu call works - BUT NOT YET DESIGNED"); 
    }

    private void backToGameMenu() {
       GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }  
}
