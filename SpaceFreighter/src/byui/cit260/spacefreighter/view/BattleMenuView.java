/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

/**
 *
 * @author Daddy
 */
public class BattleMenuView extends SuperView {
    
    
    public BattleMenuView() {
        super("\n"
                + "\n-----------------------------"
                + "\n Enemy Appeared!             |"
                + "\n-----------------------------"
                +"\nF - Fight"
                +"\nQ – Flee"              
                +"\n------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();        
        
        switch (choice) {
            case "F":
                this.fightMenu();
                break;                 
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
        private void fightMenu() {
        FightView fight = new FightView();
        fight.display();
    }

    private void goBackToShip() {
        ShipMenuView shipMenu = new ShipMenuView();
        shipMenu.display();
    }
}
