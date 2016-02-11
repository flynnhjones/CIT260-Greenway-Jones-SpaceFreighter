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
 * @author Daddy
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
}
