/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Benjamin
 */
public class Game implements Serializable{
    
    // class instance variables
       
    public static SpaceShip spaceShip;
    public static InventoryItem[] inventory;
    private Actor actor;
    public static Map map;
    public static JobBoardScene[] jobBoard;
    public static TrainingRoom[] skillPoints;

    public static TrainingRoom[] getSkillPoints() {
        return skillPoints;
    }

    public static void setSkillPoints(TrainingRoom[] skillPoints) {
        Game.skillPoints = skillPoints;
    }
    
    public static JobBoardScene[] getJobBoard() {
        return jobBoard;
    }

    public void setJobBoard(JobBoardScene[] jobBoard) {
        Game.jobBoard = jobBoard;
    }

    public Game(JobBoardScene[] jobBoard) {
        Game.jobBoard = jobBoard;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        Game.map = map;
    }

    public static SpaceShip getSpaceShip() {
        return spaceShip;
    }

    public static void setSpaceShip(SpaceShip spaceShip) {
        Game.spaceShip = spaceShip;
    }
    
    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        Game.inventory = inventory;
    }
      
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    

    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.spaceShip);
        hash = 41 * hash + Objects.hashCode(this.actor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.spaceShip, other.spaceShip)) {
            return false;
        }
        if (this.actor != other.actor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "spaceShip=" + spaceShip + ", actor=" + actor + '}';
    }

    
    
}
