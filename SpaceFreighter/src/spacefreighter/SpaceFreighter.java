/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefreighter;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.Player;
import byui.cit260.spacefreighter.view.StartProgramView;

/**
 *
 * @author Benjamin/Flynn
 */
public class SpaceFreighter {
    
    public static Game currentGame = null;
    public static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SpaceFreighter.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SpaceFreighter.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        try {
        startProgramView.displayStartProgramView();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
        }
    }
    
}
