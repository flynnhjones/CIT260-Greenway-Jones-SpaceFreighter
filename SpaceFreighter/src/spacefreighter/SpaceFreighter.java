/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefreighter;

import byui.cit260.spacefreighter.model.Actor;
import byui.cit260.spacefreighter.model.BattleScene;
import byui.cit260.spacefreighter.model.CrewSkillPoints;
import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.InventoryItem;
import byui.cit260.spacefreighter.model.JobBoardScene;
import byui.cit260.spacefreighter.model.Locations;
import byui.cit260.spacefreighter.model.Map;
import byui.cit260.spacefreighter.model.Player;
import byui.cit260.spacefreighter.model.RegularScene;
import byui.cit260.spacefreighter.model.ShopScene;
import byui.cit260.spacefreighter.model.SpaceShip;
import byui.cit260.spacefreighter.view.StartProgramView;

/**
 *
 * @author Benjamin/Flynn
 */
public class SpaceFreighter {
    
    private static Game currentGame = null;
    private static Player player = null;

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
        startProgramView.displayStartProgramView();
    }
    
}
