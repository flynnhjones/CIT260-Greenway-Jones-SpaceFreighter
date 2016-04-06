/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.TrainingRoomControl;
import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.TrainingRoom;

/**
 *
 * @author jaxom
 */
public class SkillPointView extends SuperView{

public SkillPointView() {
        super("\n"
                + "\n"
                + "*--------------------------------------*"
                + "\n|              Skill Menu              |"
                + "\n|--------------------------------------|"
                +"\n| P - Increase Pilot Skill             |"
                +"\n| M – Increase Mechanic Skill          |"
                +"\n| W – Increase Weapon Specialist Skill |"
                +"\n| D – Display Current Skill Points     |"
                +"\n| Q – Quit to Training Room Menu       |"
                +"\n*--------------------------------------*");
    }

    @Override
    public boolean doAction(String choice) {
      
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "P":
                this.increasePilotSkill();
                break;
            case "M":
               this.increaseMechanicSkill();
                break;
            case "W":
                this.increaseWeaponSpecialistSkill();
                break;
            case "D":
                this.displayCurrentSkillPoints();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void increasePilotSkill() {
        TrainingRoomControl.addPilotSkillPoint(1);  
    }

    private void increaseMechanicSkill() {
        TrainingRoomControl.addMechanicSkillPoint(1);
    }

    private void increaseWeaponSpecialistSkill() {
        TrainingRoomControl.addWeaponSpecialistSkillPoint(1);
        
    }

    private void displayCurrentSkillPoints() {
        TrainingRoom[] skillPoints = Game.skillPoints;
        this.console.println("Current Skill Level");
        this.console.println("SkillType" + "\t" + "      SkillAmount");
        this.console.println("---------------------------------");
        for(TrainingRoom skillList : skillPoints) {
            this.console.println(skillList.getSkillType() + "\t     " + skillList.getSkillAmount());
    }
   }   
}
