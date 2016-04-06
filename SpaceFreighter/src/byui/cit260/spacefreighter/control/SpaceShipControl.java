/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.JobBoardScene;
import byui.cit260.spacefreighter.model.Player;
import byui.cit260.spacefreighter.model.SpaceShip;
import byui.cit260.spacefreighter.model.TrainingRoom;
import cit.byui.cit260.spacefreighter.exceptions.JobBoardSceneControlException;
import cit.byui.cit260.spacefreighter.exceptions.SpaceShipControlException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author Ben/Flynn
 */
public class SpaceShipControl{
    
    private static PrintWriter console = SpaceFreighter.getOutFile();
    private static BufferedReader keyboard = SpaceFreighter.getInFile();
    
    public static int calcCostToRepair( int currentDurability, int mechSkillPoint) {
        if (currentDurability > 100) {
            return 0;
        }
        if (currentDurability < 0) {
            return 0;
        }
        if (mechSkillPoint > 10) {
            return 0;
        }
        if (mechSkillPoint <0) {
            return 0;
        }
        
        int costToRepair = ((100 - currentDurability)* 2) - (mechSkillPoint * 5);        
        
        if (costToRepair < 0) {         
            costToRepair = 0;
        }
        return costToRepair;
    }
    
    public static int calcCostToRefuel( int pilotSkillPoint, int currentFuelGauge) throws SpaceShipControlException{
        if (pilotSkillPoint > 10 || pilotSkillPoint < 0){
            throw new SpaceShipControlException("Can not repair ship because"
                + " you're too good or too bad!"
                    + "mechanic skill point exceeds parameters.");
        }
        if (currentFuelGauge > 100 || currentFuelGauge < 0){
            throw new SpaceShipControlException("Can not repair ship because"
                + "your ship is too broken or too full! Ship fuel exceeds the parameters.");
        }
        
        double skillPointBonus = (pilotSkillPoint * 0.05);
        
        double costToReFuel = ((100 - currentFuelGauge)*3)-((100 - currentFuelGauge)*3)*skillPointBonus;
        
        
        
        return (int) costToReFuel;
        
        
    }    
    
    public static void costToRefuel() throws SpaceShipControlException, IOException {
        String refuelMessage;
        
            SpaceShip ship = Game.getSpaceShip();
            TrainingRoom[] skillPoints = Game.getSkillPoints();
            int theCostToRefuel;
            int currentFuelGauge = ship.fuelGauge;
            int pilotSkillPoint = skillPoints[TrainingRoomControl.Skill.pilotPoint.ordinal()].getSkillAmount();
            theCostToRefuel = SpaceShipControl.calcCostToRefuel(pilotSkillPoint,currentFuelGauge);
        
        
            refuelMessage = "\nThe cost to refuel will be " + theCostToRefuel + " Currency. Would you like to refuel? Y for yes, N for no.";  
            SpaceShipControl.console.println(refuelMessage);
            
            String answer = SpaceShipControl.keyboard.readLine();
            answer = answer.toUpperCase();
        if ("Y".equals(answer)) {
            CurrencyControl.removeCurrency(theCostToRefuel);
            ship.fuelGauge = 100;    
            SpaceShipControl.console.println("You're fueled up and good to go! Get flying!");
        }
        else {
            SpaceShipControl.console.println("Fine, don't refuel. See if your ship cares!");            
        
        
        }
    }
    
    public static void costToRepair() throws SpaceShipControlException, IOException {
        String repairMessage;
        
            SpaceShip ship = Game.getSpaceShip();
            TrainingRoom[] skillPoints = Game.getSkillPoints();
            int theCostToRepair;
            int currentDurability = ship.durability;
            int mechSkillPoint = skillPoints[TrainingRoomControl.Skill.mechanicPoint.ordinal()].getSkillAmount();
            theCostToRepair = SpaceShipControl.calcCostToRepair(currentDurability, mechSkillPoint);
        
        
            repairMessage = "\nThe cost to repair will be " + theCostToRepair + " Currency. Would you like to refuel? Y for yes, N for no.";  
            SpaceShipControl.console.println(repairMessage);
            
            String answer = SpaceShipControl.keyboard.readLine();
            answer = answer.toUpperCase();
        if ("Y".equals(answer)) {
            CurrencyControl.removeCurrency(theCostToRepair);
            ship.durability = 100;    
            SpaceShipControl.console.println("You're repaired up and good to go! Get flying!");
        }
        else {
            SpaceShipControl.console.println("Fine, don't repair. See if your ship cares!");            
        
        
        }
    }

    static void removeFuelAndDurability() {
        SpaceShip ship = Game.getSpaceShip();
        ship.fuelGauge = ship.fuelGauge - 20;
        ship.durability = ship.durability - 20;
    }

    public static void saveSpaceShip(SpaceShip spaceShip, String filePath) throws SpaceShipControlException {
        try(FileOutputStream fops = new FileOutputStream("C:/SpaceGame/ship." + filePath + ".txt")) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(spaceShip);
        }
        catch(Exception e) {
            throw new SpaceShipControlException(e.getMessage());
    }
    }

    static void getSavedSpaceShip(String filePath) throws SpaceShipControlException {
        try(FileInputStream fips = new FileInputStream("C:/SpaceGame/ship." + filePath + ".txt")) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            Game.spaceShip = (SpaceShip) input.readObject();
        }
        catch(Exception e) {
            throw new SpaceShipControlException(e.getMessage());
        }
    }
    }


