/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.TrainingRoom;
import byui.cit260.spacefreighter.view.TrainingRoomView;
import java.io.BufferedReader;
import java.io.PrintWriter;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author jaxom
 */
public class TrainingRoomControl {
    
    private static PrintWriter console = SpaceFreighter.getOutFile();
    private static BufferedReader keyboard = SpaceFreighter.getInFile();
    
    
    public static TrainingRoom[] createSkillPoint(){
        
        TrainingRoom[] skillPoints = new TrainingRoom[4];
        
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
        
        TrainingRoom unusedSkillPoint = new TrainingRoom();
        unusedSkillPoint.setSkillType("Weapon Specialist");
        unusedSkillPoint.setSkillAmount(0);
        skillPoints[TrainingRoomControl.Skill.unusedSkillPoint.ordinal()] = unusedSkillPoint;
        
        return skillPoints;
        }

  

    public enum Skill {
        pilotPoint,
        mechanicPoint,
        weaponSpecialistPoint,   
        unusedSkillPoint;
        }
    
    public static void addPilotSkillPoint(int i) {
        TrainingRoom[] skillPoints = Game.skillPoints;
        if (skillPoints[TrainingRoomControl.Skill.unusedSkillPoint.ordinal()].getSkillAmount() < 1) {
            TrainingRoomView.noSkillPoints();
            return;
        }
        int pilotPoint = skillPoints[TrainingRoomControl.Skill.pilotPoint.ordinal()].getSkillAmount() + i;        
        skillPoints[TrainingRoomControl.Skill.pilotPoint.ordinal()].setSkillAmount(pilotPoint);
        TrainingRoomControl.removeUnusedSkillPoint();
        
        TrainingRoomControl.console.println("Your Pilot Skill points are now " + pilotPoint + " points!");
        
    }
    
    public static void addMechanicSkillPoint(int i) {
        TrainingRoom[] skillPoints = Game.skillPoints;
        if (skillPoints[TrainingRoomControl.Skill.unusedSkillPoint.ordinal()].getSkillAmount() < 1) {
            TrainingRoomView.noSkillPoints();
            return;
        }
        int mechanicPoint = skillPoints[TrainingRoomControl.Skill.mechanicPoint.ordinal()].getSkillAmount() + i;
        skillPoints[TrainingRoomControl.Skill.mechanicPoint.ordinal()].setSkillAmount(mechanicPoint);
        TrainingRoomControl.removeUnusedSkillPoint();
        
        TrainingRoomControl.console.println("Your Mechanic Skill points are now " + mechanicPoint + " points!");
    }
    
    public static void addWeaponSpecialistSkillPoint(int i) {
        TrainingRoom[] skillPoints = Game.skillPoints;
        if (skillPoints[TrainingRoomControl.Skill.unusedSkillPoint.ordinal()].getSkillAmount() < 1) {
            TrainingRoomView.noSkillPoints();
            return;
        }
        int weaponSpecialistPoint = skillPoints[TrainingRoomControl.Skill.weaponSpecialistPoint.ordinal()].getSkillAmount() + i;
        skillPoints[TrainingRoomControl.Skill.weaponSpecialistPoint.ordinal()].setSkillAmount(weaponSpecialistPoint);
        TrainingRoomControl.removeUnusedSkillPoint();
        
        TrainingRoomControl.console.println("Your Weapon Specialist Skill points are now " + weaponSpecialistPoint + " points!");
    }
    
    public static void addUnusedSkillPoint(int i) {
        TrainingRoom[] skillPoints = Game.skillPoints;
        int unusedSkillPoint = skillPoints[TrainingRoomControl.Skill.unusedSkillPoint.ordinal()].getSkillAmount() + i;
        skillPoints[TrainingRoomControl.Skill.unusedSkillPoint.ordinal()].setSkillAmount(unusedSkillPoint);
    }
      private static void removeUnusedSkillPoint() {
        TrainingRoom[] skillPoints = Game.skillPoints;
        int unusedSkillPoint = skillPoints[TrainingRoomControl.Skill.unusedSkillPoint.ordinal()].getSkillAmount() - 1;
        skillPoints[TrainingRoomControl.Skill.unusedSkillPoint.ordinal()].setSkillAmount(unusedSkillPoint);
    }
}
