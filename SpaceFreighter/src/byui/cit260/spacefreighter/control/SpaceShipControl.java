/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

/**
 *
 * @author Daddy
 */
public class SpaceShipControl {
    
    public int calcCostToRepair( int durability, int mechSkillPoint) {
        if (durability > 100) {
            return 0;
        }
        if (durability < 0) {
            return 0;
        }
        if (mechSkillPoint > 10) {
            return 0;
        }
        if (mechSkillPoint <0) {
            return 0;
        }
        
        int costToRepair = ((100 - durability)* 2) - (mechSkillPoint * 5);        
        
        if (costToRepair < 0) {
            costToRepair = 0;
        }
        return costToRepair;
    }
    public double calcCostToReFuel( double pilotSkillPoint, double currentFuelCapacity){
        if (pilotSkillPoint > 10 || pilotSkillPoint < 0){
            return 0;
        }
        if (currentFuelCapacity > 100 || currentFuelCapacity < 0){
            return 0;
        }
        
        double skillPointBonus = (pilotSkillPoint * 0.05);
        
        double costToReFuel = ((100 - currentFuelCapacity)*3)-((100 - currentFuelCapacity)*3)*skillPointBonus;
        
        return Math.round(costToReFuel);
    }
}
