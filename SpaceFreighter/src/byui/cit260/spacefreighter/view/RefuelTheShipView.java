/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.SpaceShipControl;
import cit.byui.cit260.spacefreighter.exceptions.SpaceShipControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author jaxom
 */
    class RefuelTheShipView {
        
        private String promptMessageCurrentFuelGauge;
        private String promptMessagePilotSkillPoint;
        private String refuelMessage;
        PrintWriter console = SpaceFreighter.getOutFile();

        public RefuelTheShipView() {
        
            this.promptMessageCurrentFuelGauge = "\nWhat is the ships current Fuel gauge at (1-100)?";                
            this.promptMessagePilotSkillPoint = "\nWhat is your pilot skill point amount (1-10)?";
        }
    
        private double getTheCostToRepair() throws SpaceShipControlException, IOException {
            double currentFuelGauge = this.getCurrentFuelGauge();
            double pilotSkillPoint = this.getPilotSkillPoint();
            double theCostToRefuel = SpaceShipControl.calcCostToRefuel(pilotSkillPoint,currentFuelGauge);
            return theCostToRefuel;
        }
        
        private double getCurrentFuelGauge() throws IOException {
            BufferedReader keyboard = SpaceFreighter.getInFile();
            String currentFuelGauge;
            double currentFuelGaugeValue =0;
                
            this.console.println("\n" + this.promptMessageCurrentFuelGauge);
            
            currentFuelGauge = keyboard.readLine();
            try {
            currentFuelGaugeValue = parseDouble(currentFuelGauge);
            } catch(NumberFormatException nf) {
                ErrorView.display("currentFuelGauge", nf.getMessage());
                this.console.println("\nYou must enter a valid number."
                        + " Try again.");
                this.getCurrentFuelGauge();
            }
            return currentFuelGaugeValue;
        }
        
        private double getPilotSkillPoint() throws IOException {
            BufferedReader keyboard = SpaceFreighter.getInFile();
            String pilotSkillPoint;
            int pilotSkillPointValue = 0;
            
            this.console.println("\n" + this.promptMessagePilotSkillPoint);
            pilotSkillPoint = keyboard.readLine();
            
            try{
            pilotSkillPointValue = parseInt(pilotSkillPoint);
            } catch (NumberFormatException nf) {
                ErrorView.display("pilotSkillValue", nf.getMessage());
                this.console.println("\nYou must enter a valid number."
                        + " Try again.");
                this.getPilotSkillPoint();
            }
            return pilotSkillPointValue;
        }
        
        void CostToRefuel() throws SpaceShipControlException, IOException {
            double theCostToRefuel;
            double currentFuelGauge = this.getCurrentFuelGauge();
            double pilotSkillPoint = this.getPilotSkillPoint();
            theCostToRefuel = SpaceShipControl.calcCostToRefuel(pilotSkillPoint,currentFuelGauge);
        
        if (currentFuelGauge < 0){
            this.refuelMessage = "\nError, Your fuel is too Low";
        }
        else if (currentFuelGauge > 100){
            this.refuelMessage = "\nError Your fuel is too high";
        }
        else if (pilotSkillPoint > 10){
            this.refuelMessage = "\nError Pilot skill point is too high";  
        }
        else if (pilotSkillPoint < 0){
            this.refuelMessage = "\nError Pilot skill point is too low";
        }
        else {
            this.refuelMessage = "\nThe cost to refuel will be " + theCostToRefuel + " Currency.";
        }
        
        this.console.println(refuelMessage);
        }
    }
