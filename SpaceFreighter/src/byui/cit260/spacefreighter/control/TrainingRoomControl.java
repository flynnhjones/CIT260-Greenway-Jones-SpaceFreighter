/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.TrainingRoom;

/**
 *
 * @author jaxom
 */
public class TrainingRoomControl {
    
    
    public static TrainingRoom[] createSkillPoint(){
        
        TrainingRoom[] skillPoints = new TrainingRoom[3];
        
        TrainingRoom pilotPoint = new TrainingRoom();
        pilotPoint.setSkillType("Pilot");
        pilotPoint.setSkillAmount(0);
        skillPoints[TrainingRoomControl.Skill.pilotPoint.ordinal()] = pilotPoint;
        
        TrainingRoom mechanicPoint = new TrainingRoom();
        mechanicPoint.setSkillType("Mechanic");
        mechanicPoint.setSkillAmount(0);
        skillPoints[TrainingRoomControl.Skill.mechanicPoint.ordinal()] = mechanicPoint;
        
        TrainingRoom weaponSpecialistPoint = new TrainingRoom();
        weaponSpecialistPoint.setSkillType("Weapon Specialist");
        weaponSpecialistPoint.setSkillAmount(0);
        skillPoints[TrainingRoomControl.Skill.weaponSpecialistPoint.ordinal()] = weaponSpecialistPoint;
        
        return skillPoints;
        }

    public enum Skill {
        pilotPoint,
        mechanicPoint,
        weaponSpecialistPoint;   
        }
    
    public static void addPilotSkillPoint(int i) {
        TrainingRoom[] skillPoints = Game.skillPoints;
        int pilotPoint = skillPoints[TrainingRoomControl.Skill.pilotPoint.ordinal()].getSkillAmount() + i;
        skillPoints[TrainingRoomControl.Skill.pilotPoint.ordinal()].setSkillAmount(pilotPoint);
    }
    
    public static void addMechanicSkillPoint(int i) {
        TrainingRoom[] skillPoints = Game.skillPoints;
        int mechanicPoint = skillPoints[TrainingRoomControl.Skill.mechanicPoint.ordinal()].getSkillAmount() + i;
        skillPoints[TrainingRoomControl.Skill.mechanicPoint.ordinal()].setSkillAmount(mechanicPoint);
    }
    
    public static void addWeaponSpecialistSkillPoint(int i) {
        TrainingRoom[] skillPoints = Game.skillPoints;
        int weaponSpecialistPoint = skillPoints[TrainingRoomControl.Skill.weaponSpecialistPoint.ordinal()].getSkillAmount() + i;
        skillPoints[TrainingRoomControl.Skill.weaponSpecialistPoint.ordinal()].setSkillAmount(weaponSpecialistPoint);
    }
}
