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
                + "\n"
                + "*----------------------------------*"
                + "\n|            Ship Menu             |"
                + "\n|----------------------------------|"
                +"\n| R - Repair damaged ship          |"
                +"\n| U – Upgrade the ships Components |"
                +"\n| F – Refuel the ship              |"
                +"\n| J – Check out the Job Board      |"
                +"\n| T – Training room                |"
                +"\n| Q – Quit to game menu            |"
                +"\n*----------------------------------*");
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
       RefuelTheShipView refuelTheShip = new RefuelTheShipView();
        refuelTheShip.CostToRefuel(); 
    }

    private void backToGameMenu() {
       GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }  
}
