/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.SpaceShipControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author jaxom
 */
class RepairTheShipView {
    private String promptMessageCurrentDurability;
    private String promptMessageMechSkillPoint;
    private String repairMessage;
    PrintWriter console = SpaceFreighter.getOutFile();
    

    public RepairTheShipView() {
        this.promptMessageCurrentDurability = "\nWhat is the ships current durability (1-100)?";                
        this.promptMessageMechSkillPoint = "\nWhat is your mechanic skill point amount (1-10)?";                       
    }
    
    private int getTheCostToRepair() throws IOException {
        int currentDurability = this.getCurrentDurability();
        int mechSkillPoint = this.getMechSkillPoint();
         int theCostToRepair = SpaceShipControl.calcCostToRepair(currentDurability,mechSkillPoint);
        
        return theCostToRepair;
    }

    private int getCurrentDurability() throws IOException {
       BufferedReader keyboard = SpaceFreighter.getInFile();
        String currentDurability;
                
         this.console.println("\n" + this.promptMessageCurrentDurability);
            
            currentDurability = keyboard.readLine();
            int durability = 0;
            
            try{
            durability = parseInt(currentDurability);
            } catch (NumberFormatException nf) {
                ErrorView.display("RepairTheShipView, durability", nf.getMessage());
                this.console.println("\nYou must enter a valid number."
                        + " Try again.");
                this.getCurrentDurability();
            }
                    
            return durability; 
    }

    private int getMechSkillPoint() throws IOException {
        
        BufferedReader keyboard = SpaceFreighter.getInFile();
        
        String mechSkillPoint;
                
         this.console.println("\n" + this.promptMessageMechSkillPoint);
            
            mechSkillPoint = keyboard.readLine();
            int mechPoint = 0;
            try {
            mechPoint = parseInt(mechSkillPoint);
            } catch(NumberFormatException nf) {
                ErrorView.display("RepairTheShipView, mechSkillPoint", nf.getMessage());
                this.console.println("\nYou must enter a valid number."
                        + " Try again.");
                this.getMechSkillPoint();
            }
                    
            return mechPoint;
    }
    void CostToRepair() throws IOException {
        int theCostToRepair;
        int currentDurability = this.getCurrentDurability();
        int mechSkillPoint = this.getMechSkillPoint();
        theCostToRepair = SpaceShipControl.calcCostToRepair(currentDurability,mechSkillPoint);
        
        if (currentDurability < 0){
            this.repairMessage = "\nDurability Too Low";
        }
        else if (currentDurability > 100){
            this.repairMessage = "\nError Durability too high";
        }
        else if (mechSkillPoint > 10){
            this.repairMessage = "\nError mechanic skill point is too high";  
        }
        else if (mechSkillPoint < 0){
            this.repairMessage = "\nError mechanic skill point is too low";
        }
        else {
            this.repairMessage = "\nThe cost to repair will be " + theCostToRepair + " Currency.";
        }
        
        this.console.println(repairMessage);
    }  
}
