package byui.cit260.spacefreighter.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
/**
 *
 * @author jaxom
 */
public class TrainingRoomView extends SuperView {
    
        public TrainingRoomView() {
         
            super("\n"
                + "*-------------------------------------------*"
                + "\n|             |Training Room|                |"
                + "\n|-------------------------------------------|"
                +"\n| Current Pilot Skill Points: 3             |"
                +"\n| Current Mechanic Skill Points: 2          |"
                +"\n| Current Weapon Specialist Skill Points: 5 |"
                +"\n| P - Increase the Pilot skill.             |"
                +"\n| M – Increase the Mechanic skill.          |"
                +"\n| F – Increase the Weapon Specialist skill. |"
                +"\n| Q – Quit to Ship Menu                     |"
                +"\n*-------------------------------------------*");
         
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
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }


    
    private void increasePilotSkill() {
        System.out.println("The increasePilotSkill call works, but hasn't been designed yet.");
    }

    private void increaseMechanicSkill() {
        System.out.println("The increaseMechanicSkill call works, but hasn't been designed yet.");
    }

    private void increaseWeaponSpecialistSkill() {
        System.out.println("The increaseWeaponSpecialistSkill call works, but hasn't been designed yet.");
    }
    
}
