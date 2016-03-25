/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.BattleSceneControl;
import cit.byui.cit260.spacefreighter.exceptions.BattleSceneControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import spacefreighter.SpaceFreighter;

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
    PrintWriter console = SpaceFreighter.getOutFile();

    public AttackView() {
        this.promptMessageAttack = "\nWhat is your attack?";                
        this.promptMessageSkill = "\nWhat is your Weapon Specialist Skill Level?";                
        this.promptMessageDefense = "\nWhat is the enemy defense?";         
    }
    
    private int getDamage() throws BattleSceneControlException, IOException {
        int attack = this.getAttack();
        int skill = this.getSkill();
        int defense = this.getDefense();
        int damage = BattleSceneControl.calcDamageDone(attack,skill,defense);
        
        return damage;
    }

    private int getAttack() throws IOException {
        BufferedReader keyboard = SpaceFreighter.getInFile();
        String attack;        
        int attackValue = 0;        
         this.console.println("\n" + this.promptMessageAttack);
            
            attack = keyboard.readLine();
            try{
            attackValue = parseInt(attack);
            } catch(NumberFormatException nf) {
                ErrorView.display("AttackView in getAttack", nf.getMessage());
                        this.getAttack();
            }
                    
            return attackValue;
    }   

    private int getSkill() throws IOException {
        BufferedReader keyboard = SpaceFreighter.getInFile();
        String skill;
        int skillValue = 0;                
         this.console.println("\n" + this.promptMessageSkill);
         
         
            
            skill = keyboard.readLine();
            
            try{
             skillValue = parseInt(skill);
         } catch(NumberFormatException nf) {
             ErrorView.display("AttackView in getSkill", nf.getMessage());
             this.getSkill();
         }
                    
            return skillValue;
    }

    private int getDefense() throws IOException {
        BufferedReader keyboard = SpaceFreighter.getInFile();
        String defense;
        int defenseValue = 0;
                
         this.console.println("\n" + this.promptMessageDefense);
            
            defense = keyboard.readLine();
            try {
                defenseValue = parseInt(defense);
            } catch (NumberFormatException nf) {
                ErrorView.display("AttackView in getEnemyDefense", nf.getMessage());
                this.getDefense();
            }
                    
            return defenseValue;
    }

    void attack() throws BattleSceneControlException, IOException {
        int damage;
        damage = this.getDamage();
        this.damageLevel = this.getDamageLevel(damage);
        this.console.println("\nYou did " + damage + " damage!" + damageLevel);
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
