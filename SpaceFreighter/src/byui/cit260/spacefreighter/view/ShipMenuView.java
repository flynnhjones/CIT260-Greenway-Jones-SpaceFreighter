/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.ItemControl;
import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.SpaceShip;
import cit.byui.cit260.spacefreighter.exceptions.ItemControlException;
import cit.byui.cit260.spacefreighter.exceptions.SpaceShipControlException;
import java.io.IOException;

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
                +"\n| F – Refuel the ship              |"
                +"\n| J – Check out the Job Board      |"
                +"\n| S - Go to the onboard shop       |"
                +"\n| T – Training room                |"
                +"\n| C - Check Current Value          |"
                +"\n| X - Check ship fuel and armor    |"
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
                ErrorView.display("repairTheShipMenu", ex.getMessage());
            }
        }
                break;
            case "F":
        {
            try {
                this.refuelTheShipMenu();
            } catch (SpaceShipControlException | IOException ex) {
                ErrorView.display("refuelTheShipMenu", ex.getMessage());
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
            } catch (ItemControlException | IOException ex) {
                ErrorView.display("checkValue", ex.getMessage());
                }
        }
                break;
            case "X":
                this.checkShipValue();
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

    private void checkValue() throws ItemControlException, IOException {
        int value;
        
        value = ItemControl.findValue(Game.inventory);
        int stillNeeded = 10000 - value;
        this.console.println("Your current net worth is " + value + " currency.");
        if (stillNeeded < 1) {
            this.console.println("You have enough to live rich the rest of your days!"
                    + "\nWould you like to retire? Y for yes or N for no.");
            String answer = this.keyboard.readLine();
            answer = answer.toUpperCase();
            if ("Y".equals(answer)) {                
                VictoryView.youWin();
            } else{
                this.console.println("Ok, you don't have to if you don't want to. Keep playing!");
            }
        } else {
                this.console.println("You still need " + stillNeeded + " Space Bucks to retire");
        }        
        
    }

    private void checkShipValue() {
        SpaceShip ship = Game.spaceShip;
        this.console.println("Your ship has " + ship.getDurability() + " durability and " + ship.getFuelCapacity() + " fuel remaining.");
    }
}
