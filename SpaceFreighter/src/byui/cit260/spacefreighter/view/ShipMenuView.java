/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.ItemControl;
import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.InventoryItem;
import cit.byui.cit260.spacefreighter.exceptions.ItemControlException;
import cit.byui.cit260.spacefreighter.exceptions.SpaceShipControlException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                +"\n| S - Go to the onboard shop       |"
                +"\n| T – Training room                |"
                +"\n| C - Check Current Value          |"
                +"\n| Q – Quit to game menu            |"
                +"\n*----------------------------------*");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "R":
        {
            try {
                this.repairTheShipMenu();
            } catch (IOException ex) {
                this.console.println(ex.getMessage());
            }
        }
                break;
            case "U":
                this.upgradeTheShipMenu();
                break;
            case "F":
        {
            try {
                this.refuelTheShipMenu();
            } catch (SpaceShipControlException ex) {
                this.console.println(ex.getMessage());
            } catch (IOException ex) {
                this.console.println(ex.getMessage());
            }
        }
                break;
            case "J":
                this.jobBoardMenu();
                break;
            case "S":
                this.shopMenu();
                break;
            case "T":
                this.trainingRoomMenu();
                break;  
            case "C":
        {
            try {
                this.checkValue();
            } catch (ItemControlException ex) {
                this.console.println(ex.getMessage());
            }
        }
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    private void repairTheShipMenu() throws IOException {
        RepairTheShipView repairTheShip = new RepairTheShipView();
        repairTheShip.CostToRepair();
    }

    private void upgradeTheShipMenu() {
        this.console.println("Upgrade Ship Menu call works - BUT NOT YET DESIGNED");
    }

    private void jobBoardMenu() {
       JobBoardView jobBoard = new JobBoardView(); 
       jobBoard.display();
    }

    private void trainingRoomMenu() {
       TrainingRoomView trainingRoom = new TrainingRoomView();
       trainingRoom.display();
    }
    
    private void refuelTheShipMenu() throws SpaceShipControlException, IOException {
       RefuelTheShipView refuelTheShip = new RefuelTheShipView();
        refuelTheShip.CostToRefuel(); 
    }

    private void shopMenu() {
        ShopView shop = new ShopView();
                shop.display();
    }

    private void checkValue() throws ItemControlException {
        int value;
        
        value = ItemControl.findValue(Game.inventory);
        this.console.println("Your current net worth is " + value + " currency.");
    }
}
