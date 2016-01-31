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
    
    
    
    
}
