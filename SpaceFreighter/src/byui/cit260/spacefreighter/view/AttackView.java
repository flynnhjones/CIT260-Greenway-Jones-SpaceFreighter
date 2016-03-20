/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.BattleSceneControl;
import cit.byui.cit260.spacefreighter.exceptions.BattleSceneControlException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Daddy
 */
class AttackView {
    private String promptMessageAttack;
    private String promptMessageSkill;
    private String promptMessageDefense;
    private String damageLevel;
    private int characterAttack;
    private int weaponSpecialistSkill;
    private int enemyDefense;

    public AttackView() {
        this.promptMessageAttack = "\nWhat is your attack?";                
        this.promptMessageSkill = "\nWhat is your Weapon Specialist Skill Level?";                
        this.promptMessageDefense = "\nWhat is the enemy defense?";         
    }
    
    private int getDamage() throws BattleSceneControlException {
        int attack = this.getAttack();
        int skill = this.getSkill();
        int defense = this.getDefense();
        int damage = BattleSceneControl.calcDamageDone(attack,skill,defense);
        
        return damage;
    }

    private int getAttack() {
        Scanner keyboard = new Scanner(System.in);
        String attack;        
        int attackValue = 0;        
         System.out.println("\n" + this.promptMessageAttack);
            
            attack = keyboard.nextLine();
            try{
            attackValue = parseInt(attack);
            } catch(NumberFormatException nf) {
                System.out.println("\nYou must enter a number.");
                        this.getAttack();
            }
                    
            return attackValue;
    }   

    private int getSkill() {
        Scanner keyboard = new Scanner(System.in);
        String skill;
        int skillValue = 0;                
         System.out.println("\n" + this.promptMessageSkill);
         
         
            
            skill = keyboard.nextLine();
            
            try{
             skillValue = parseInt(skill);
         } catch(NumberFormatException nf) {
             System.out.println("You must enter a number");
             this.getSkill();
         }
                    
            return skillValue;
    }

    private int getDefense() {
        Scanner keyboard = new Scanner(System.in);
        String defense;
        int defenseValue = 0;
                
         System.out.println("\n" + this.promptMessageDefense);
            
            defense = keyboard.nextLine();
            try {
                defenseValue = parseInt(defense);
            } catch (NumberFormatException nf) {
                System.out.println("You must enter a number.");
                this.getDefense();
            }
                    
            return defenseValue;
    }

    void attack() throws BattleSceneControlException {
        int damage;
        damage = this.getDamage();
        this.damageLevel = this.getDamageLevel(damage);
        System.out.println("\nYou did " + damage + " damage!" + damageLevel);
    }

    private String getDamageLevel(int damage) {
        String damageLevelMessage;
        if (damage < 50) {
            damageLevelMessage = "\nA weak hit.";            
        }
        else if (damage < 200) {
            damageLevelMessage = "\nA decent hit!";
        }
        else if (damage < 500) {
            damageLevelMessage = "\nA good hit!";
        }
        else if (damage < 1000) {
            damageLevelMessage = "\nA strong hit!";
        }
        else {
            damageLevelMessage = "\nAn amazing hit!";
        }
        return damageLevelMessage;
    } 
}
