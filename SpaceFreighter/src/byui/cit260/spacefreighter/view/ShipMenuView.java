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
public class ShipMenuView extends SuperView {
    
    public ShipMenuView() {
        super("\n"
                + "\n-----------------------------"
                + "\n Ship Menu                   |"
                + "\n-----------------------------"
                +"\nR - Repair damaged ship"
                +"\nU – Upgrade the ships Components"
                +"\nF – Refuel the ship"
                +"\nJ – Check out the Job Board"
                +"\nT – Training room"                
                +"\nQ – Quit to game menu"
                +"\n------------------------------");
    }
    
    @Override
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
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    private void repairTheShipMenu() {
        RepairTheShipView repairTheShip = new RepairTheShipView();
        repairTheShip.CostToRepair();
    }

    private void upgradeTheShipMenu() {
        System.out.println("Upgrade Ship Menu call works - BUT NOT YET DESIGNED");
    }

    private void jobBoardMenu() {
       JobBoardView jobBoard = new JobBoardView(); 
       jobBoard.display();
    }

    private void trainingRoomMenu() {
       System.out.println("Training Room Menu call works - BUT NOT YET DESIGNED");
    }
    
    private void refuelTheShipMenu() {
       System.out.println("Menu call works - BUT NOT YET DESIGNED"); 
    }

    private void backToGameMenu() {
       GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }  
}
