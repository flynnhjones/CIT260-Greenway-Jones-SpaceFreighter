/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.SpaceShipControl;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author jaxom
 */
class RepairTheShipView {
    private String promptMessageCurrentDurability;
    private String promptMessageMechSkillPoint;
    private String repairMessage;
    

    public RepairTheShipView() {
        this.promptMessageCurrentDurability = "\nWhat is the ships current durability (1-100)?";                
        this.promptMessageMechSkillPoint = "\nWhat is your mechanic skill point amount (1-10)?";                       
    }
    
    private int getTheCostToRepair() {
        int currentDurability = this.getCurrentDurability();
        int mechSkillPoint = this.getMechSkillPoint();
         int theCostToRepair = SpaceShipControl.calcCostToRepair(currentDurability,mechSkillPoint);
        
        return theCostToRepair;
    }

    private int getCurrentDurability() {
       Scanner keyboard = new Scanner(System.in);
        String currentDurability;
                
         System.out.println("\n" + this.promptMessageCurrentDurability);
            
            currentDurability = keyboard.nextLine();
            int durability = 0;
            
            try{
            durability = parseInt(currentDurability);
            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number."
                        + " Try again or enter Q to quit.");
                this.getCurrentDurability();
            }
                    
            return durability; 
    }

    private int getMechSkillPoint() {
        Scanner keyboard = new Scanner(System.in);
        String mechSkillPoint;
                
         System.out.println("\n" + this.promptMessageMechSkillPoint);
            
            mechSkillPoint = keyboard.nextLine();
            int mechPoint = 0;
            try {
            mechPoint = parseInt(mechSkillPoint);
            } catch(NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number."
                        + " Try again or enter Q to quit.");
                this.getMechSkillPoint();
            }
                    
            return mechPoint;
    }
    void CostToRepair() {
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
        
        System.out.println(repairMessage);
    }  
}
