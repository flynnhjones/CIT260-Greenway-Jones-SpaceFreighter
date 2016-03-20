/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import cit.byui.cit260.spacefreighter.exceptions.BattleSceneControlException;

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
            } catch (BattleSceneControlException ex) {
                System.out.println(ex.getMessage());
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    

    private void attack() throws BattleSceneControlException {
        AttackView dodamage = new AttackView();
        dodamage.attack();
    }

    private void item() {
        System.out.println("You can use items!");
    }

    private void skill() {
        System.out.println("You can use skills!");
    }
    
}
