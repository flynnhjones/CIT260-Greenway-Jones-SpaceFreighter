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
public class BattleSceneControlTest {
    
    public BattleSceneControlTest() {
    }

    /**
     * Test of calcDamageDone method, of class BattleSceneControl.
     */
    @Test
    public void testCalcDamageDone() {
        System.out.println("calcDamageDone");
        System.out.println("\tTest case #1");
        int characterAttack = 50;
        int weaponSpecialistSkill = 1;
        int enemyDefense = 2;
        BattleSceneControl instance = new BattleSceneControl();
        int expResult = 44;
        int result = instance.calcDamageDone(characterAttack, weaponSpecialistSkill, enemyDefense);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #2");
        characterAttack = -1;
        weaponSpecialistSkill = 2;
        enemyDefense = 8;
        expResult = 0;
        result = instance.calcDamageDone(characterAttack, weaponSpecialistSkill, enemyDefense);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #3");
        characterAttack = 60;
        weaponSpecialistSkill = 11;
        enemyDefense = 0;
        expResult = 0;
        result = instance.calcDamageDone(characterAttack, weaponSpecialistSkill, enemyDefense);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #4");
        characterAttack = 100;
        weaponSpecialistSkill = 5;
        enemyDefense = 876;
        expResult = 0;
        result = instance.calcDamageDone(characterAttack, weaponSpecialistSkill, enemyDefense);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #5");
        characterAttack = 10000;
        weaponSpecialistSkill = 0;
        enemyDefense = 0;
        expResult = 10000;
        result = instance.calcDamageDone(characterAttack, weaponSpecialistSkill, enemyDefense);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #6");
        characterAttack = 0;
        weaponSpecialistSkill = 10;
        enemyDefense = 0;
        expResult = 0;
        result = instance.calcDamageDone(characterAttack, weaponSpecialistSkill, enemyDefense);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #7");
        characterAttack = 0;
        weaponSpecialistSkill = 0;
        enemyDefense = 10;
        expResult = 0;
        result = instance.calcDamageDone(characterAttack, weaponSpecialistSkill, enemyDefense);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #8");
        characterAttack = 10000;
        weaponSpecialistSkill = 10;
        enemyDefense = 10;
        expResult = 0;
        result = instance.calcDamageDone(characterAttack, weaponSpecialistSkill, enemyDefense);
        assertEquals(expResult, result);
        
    }
    
}
