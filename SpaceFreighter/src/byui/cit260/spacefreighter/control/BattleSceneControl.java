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
public class BattleSceneControl {
    
    public static int calcDamageDone(int characterAttack, int weaponSpecialistSkill, int enemyDefense) {
        
        if (characterAttack < 0) {
            return 0;
        }
        
        if (characterAttack > 10000) {
            return 0;
        }
        
        if (weaponSpecialistSkill < 0) {
            return 0;
        }
        
        if (weaponSpecialistSkill > 10) {
            return 0;
        }
        
        if (enemyDefense < 0) {
            return 0;
        }
        
        if (enemyDefense > 10) {
            return 0;
        }
        
        int damage = (int) ((characterAttack * (1 + 0.1 * weaponSpecialistSkill)) * (1 - 0.1 * enemyDefense));
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
