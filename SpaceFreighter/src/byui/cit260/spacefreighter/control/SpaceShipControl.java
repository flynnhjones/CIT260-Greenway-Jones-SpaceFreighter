/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

/**
 *
 * @author Ben/Flynn
 */
public class SpaceShipControl {
    
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
    
    public static double calcCostToRefuel( double pilotSkillPoint, double currentFuelGauge){
        if (pilotSkillPoint > 10 || pilotSkillPoint < 0){
            return 0;
        }
        if (currentFuelGauge > 100 || currentFuelGauge < 0){
            return 0;
        }
        
        double skillPointBonus = (pilotSkillPoint * 0.05);
        
        double costToReFuel = ((100 - currentFuelGauge)*3)-((100 - currentFuelGauge)*3)*skillPointBonus;
        
        return Math.round(costToReFuel);
    }
}
