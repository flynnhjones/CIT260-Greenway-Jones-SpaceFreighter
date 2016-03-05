/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.SpaceShipControl;
import java.util.Scanner;

/**
 *
 * @author jaxom
 */
    class RefuelTheShipView {
        
        private String promptMessageCurrentFuelGauge;
        private String promptMessagePilotSkillPoint;
        private String refuelMessage;

        public RefuelTheShipView() {
        
            this.promptMessageCurrentFuelGauge = "\nWhat is the ships current Fuel gauge at (1-100)?";                
            this.promptMessagePilotSkillPoint = "\nWhat is your pilot skill point amount (1-10)?";
        }
    
        private double getTheCostToRepair() {
            double currentFuelGauge = this.getCurrentFuelGauge();
            double pilotSkillPoint = this.getPilotSkillPoint();
            double theCostToRefuel = SpaceShipControl.calcCostToRefuel(pilotSkillPoint,currentFuelGauge);
            return theCostToRefuel;
        }
        
        private double getCurrentFuelGauge() {
            Scanner keyboard = new Scanner(System.in);
            double currentFuelGauge;
                
            System.out.println("\n" + this.promptMessageCurrentFuelGauge);
            
            currentFuelGauge = keyboard.nextInt();
                    
            return currentFuelGauge;
        }
        
        private double getPilotSkillPoint() {
            Scanner keyboard = new Scanner(System.in);
            double pilotSkillPoint;
            
            System.out.println("\n" + this.promptMessagePilotSkillPoint);
            pilotSkillPoint = keyboard.nextInt();
            
            return pilotSkillPoint;
        }
        
        void CostToRefuel() {
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
        
        System.out.println(refuelMessage);
        }
    }
