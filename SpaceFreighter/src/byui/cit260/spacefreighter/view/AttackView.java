/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.BattleSceneControl;
import java.util.Scanner;

/**
 *
 * @author Daddy
 */
class AttackView {
    private String promptMessageAttack;
    private String promptMessageSkill;
    private String promptMessageDefense;
    private int characterAttack;
    private int weaponSpecialistSkill;
    private int enemyDefense;

    public AttackView() {
        this.promptMessageAttack = "\nWhat is your attack?";                
        this.promptMessageSkill = "\nWhat is your Weapon Specialist Skill Level?";                
        this.promptMessageDefense = "\nWhat is the enemy defense?";
        
        
                
    }
    
    

    private int getDamage() {
        int attack = this.getAttack();
        int skill = this.getSkill();
        int defense = this.getDefense();
        int damage = BattleSceneControl.calcDamageDone(attack,skill,defense);
        
        return damage;
    }

    private int getAttack() {
        Scanner keyboard = new Scanner(System.in);
        int attack;
                
         System.out.println("\n" + this.promptMessageAttack);
            
            attack = keyboard.nextInt();
                    
            return attack;
        }
    
        
    

    private int getSkill() {
        Scanner keyboard = new Scanner(System.in);
        int skill;
                
         System.out.println("\n" + this.promptMessageSkill);
            
            skill = keyboard.nextInt();
                    
            return skill;
    }

    private int getDefense() {
        Scanner keyboard = new Scanner(System.in);
        int defense;
                
         System.out.println("\n" + this.promptMessageDefense);
            
            defense = keyboard.nextInt();
                    
            return defense;
    }

    void attack() {
        int damage;
        damage = this.getDamage();
        System.out.println("\nYou did " + damage + " damage!");
    }
    
   
}