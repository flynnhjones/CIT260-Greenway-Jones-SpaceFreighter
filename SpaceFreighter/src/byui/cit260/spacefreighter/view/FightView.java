/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import cit.byui.cit260.spacefreighter.exceptions.BattleSceneControlException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daddy
 */
class FightView extends SuperView {
    
  public FightView() {
        super("\n"
                + "\n-----------------------------"
                + "\n What will you do?           |"
                + "\n-----------------------------"
                +"\nF - Attack"
                +"\nI – Item" 
                +"\nS - Use Skill"
                +"\nQ - Go back"
                +"\n------------------------------");
    }
    
  @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "F":
        {
            try {
                this.attack();
            } catch (BattleSceneControlException | IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error: " + ex.getMessage());
            }
        }
                break;
            case "I":
                this.item();
                break;         
            case "S":
                this.skill();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    

    private void attack() throws BattleSceneControlException, IOException {
        AttackView dodamage = new AttackView();
        dodamage.attack();
    }

    private void item() {
        this.console.println("You can use items!");
    }

    private void skill() {
        this.console.println("You can use skills!");
    }
    
}
