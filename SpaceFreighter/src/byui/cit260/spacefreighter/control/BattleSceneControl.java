/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import cit.byui.cit260.spacefreighter.exceptions.BattleSceneControlException;

/**
 *
 * @author Daddy
 */
public class BattleSceneControl {
    
    public static int calcDamageDone(int characterAttack, int weaponSpecialistSkill, int enemyDefense) throws BattleSceneControlException {
        
        if (characterAttack < 0) {
            throw new BattleSceneControlException("Your character attack can't be less than zero!");
        }
        
        if (characterAttack > 10000) {
            throw new BattleSceneControlException("Your character attack is way too high! You'll destroy the universe!");
        }
        
        if (weaponSpecialistSkill < 0) {
            throw new BattleSceneControlException("Your weapon specialist skill can't be less than zero!");
        }
        
        if (weaponSpecialistSkill > 10) {
            throw new BattleSceneControlException("Your weapon specialist skill can't be higher than ten!");
        }
        
        if (enemyDefense < 0) {
            throw new BattleSceneControlException("Enemy defense can't be less than 0! They would kill themselves!");
        }
        
        if (enemyDefense > 10) {
            throw new BattleSceneControlException("Enemy defense can't be greater than 10! They would be invincible!");
        }
        
        int damage = (int) ((characterAttack * (1 + 0.1 * weaponSpecialistSkill)) * (1 - 0.1 * enemyDefense));
        if (damage < 0) {
            throw new BattleSceneControlException("You are really bad at dealing damage! You tried to do a negative amount!");
        }
        return damage;
    }
}
