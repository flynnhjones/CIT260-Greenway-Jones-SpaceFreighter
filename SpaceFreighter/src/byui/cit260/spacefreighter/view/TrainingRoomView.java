package byui.cit260.spacefreighter.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jaxom
 */
public class TrainingRoomView extends SuperView {


    
        public TrainingRoomView() {
  
         
            super("\n"
                + "*-------------------------------------------*"
                + "\n|             |Training Room|               |"
                + "\n|-------------------------------------------|"
                +"\n| I - Increase skill Points.                |"
                +"\n| U – Upgrade the Ship.                     |"
                +"\n| Q – Quit to Ship Menu                     |"
                +"\n*-------------------------------------------*");
         
         }

 
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "I":
                this.increaseSkillPoints();
                break;
            case "U":
                this.upgradeTheShip();
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void increaseSkillPoints() {
        SkillPointView SkillPoint = new SkillPointView();
         SkillPoint.display();
    }

    private void upgradeTheShip() {
        UpgradeTheShipView upgrade = new UpgradeTheShipView();
        upgrade.display();
    }

        public static void noSkillPoints() {
        TrainingRoomView.console.println("You don't have any unused skill points, sucka!");
    }

    
}
