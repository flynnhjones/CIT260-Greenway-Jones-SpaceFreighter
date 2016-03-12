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
    private String newGame;
    private String savedGame;
    private String helpMenu; 
    private SpaceShip spaceShip;
    private InventoryItem[] inventory;
    private Actor actor;
    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public SpaceShip getSpaceShip() {
        return spaceShip;
    }

    public void setSpaceShip(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
    }
    
    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }
      
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    public String getNewGame() {
        return newGame;
    }
       
    public void setNewGame(String newGame) {
        this.newGame = newGame;
    }

    public String getSavedGame() {
        return savedGame;
    }

    public void setSavedGame(String savedGame) {
        this.savedGame = savedGame;
    }

    public String getHelpMenu() {
        return helpMenu;
    }

    public void setHelpMenu(String helpMenu) {
        this.helpMenu = helpMenu;
    }

    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.newGame);
        hash = 67 * hash + Objects.hashCode(this.savedGame);
        hash = 67 * hash + Objects.hashCode(this.helpMenu);
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
        if (!Objects.equals(this.newGame, other.newGame)) {
            return false;
        }
        if (!Objects.equals(this.savedGame, other.savedGame)) {
            return false;
        }
        if (!Objects.equals(this.helpMenu, other.helpMenu)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "newGame=" + newGame + ", savedGame=" + savedGame + ", helpMenu=" + helpMenu + '}';
    }

    public void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
