/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Flynn/Ben
 */
public class SpaceShipControlTest {
    
    public SpaceShipControlTest() {
    }

    /**
     * Test of calcCostToRepair method, of class SpaceShipControl.
     */
    @Test
    public void testCalcCostToRepair() {
        System.out.println("calcCostToRepair");
        System.out.println("\tTest case #1");
        int durability = 40;
        int mechSkillPoint = 2;
        SpaceShipControl instance = new SpaceShipControl();
        int expResult = 110;
        int result = instance.calcCostToRepair(durability, mechSkillPoint);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
               
        System.out.println("\tTest case #2");
        durability = -1;
        mechSkillPoint = 11;
        expResult = 0;
        result = instance.calcCostToRepair(durability, mechSkillPoint);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #3");
        durability = 110;
        mechSkillPoint = -1;
        expResult = 0;
        result = instance.calcCostToRepair(durability, mechSkillPoint);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #4");
        durability = 4000;
        mechSkillPoint = 876;
        expResult = 0;
        result = instance.calcCostToRepair(durability, mechSkillPoint);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #5");
        durability = 100;
        mechSkillPoint = 0;
        expResult = 0;
        result = instance.calcCostToRepair(durability, mechSkillPoint);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #6");
        durability = 0;
        mechSkillPoint = 10;
        expResult = 150;
        result = instance.calcCostToRepair(durability, mechSkillPoint);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #7");
        durability = 100;
        mechSkillPoint = 10;
        expResult = 0;
        result = instance.calcCostToRepair(durability, mechSkillPoint);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcCostToReFuel method, of class SpaceShipControl.
     * @author Flynn
     */
    @Test
    public void testCalcCostToReFuel() {
        System.out.println("calcCostToReFuel");
        System.out.println("\tTest case #1");
        double pilotSkillPoint = 7;
        double currentFuelCapacity = 75;
        SpaceShipControl instance = new SpaceShipControl();
        double expResult = 49;
        double result = instance.calcCostToReFuel(pilotSkillPoint, currentFuelCapacity);
        assertEquals(expResult, result, 0.0);
        
         System.out.println("\tTest case #2");
        pilotSkillPoint = 6;
        currentFuelCapacity = -57;
        expResult = 0;
        result = instance.calcCostToReFuel(pilotSkillPoint, currentFuelCapacity);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case #3");
        pilotSkillPoint = 3;
        currentFuelCapacity = 110;
        expResult = 0;
        result = instance.calcCostToReFuel(pilotSkillPoint, currentFuelCapacity);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case #4");
        pilotSkillPoint = 867;
        currentFuelCapacity = 75;
        expResult = 0;
        result = instance.calcCostToReFuel(pilotSkillPoint, currentFuelCapacity);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case #5");
        pilotSkillPoint = 10;
        currentFuelCapacity = 0;
        expResult = 150;
        result = instance.calcCostToReFuel(pilotSkillPoint, currentFuelCapacity);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case #6");
        pilotSkillPoint = 0;
        currentFuelCapacity = 100;
        expResult = 0;
        result = instance.calcCostToReFuel(pilotSkillPoint, currentFuelCapacity);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case #7");
        pilotSkillPoint = 10;
        currentFuelCapacity = 100;
        expResult = 0;
        result = instance.calcCostToReFuel(pilotSkillPoint, currentFuelCapacity);
        assertEquals(expResult, result, 0.0);
    }   
}
