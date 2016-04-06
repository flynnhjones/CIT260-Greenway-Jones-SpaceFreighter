/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.InventoryItem;
import byui.cit260.spacefreighter.model.JobBoardScene;
import byui.cit260.spacefreighter.model.Map;
import byui.cit260.spacefreighter.model.Player;
import byui.cit260.spacefreighter.model.SpaceShip;
import byui.cit260.spacefreighter.model.TrainingRoom;
import cit.byui.cit260.spacefreighter.exceptions.GameControlException;
import cit.byui.cit260.spacefreighter.exceptions.JobBoardSceneControlException;
import cit.byui.cit260.spacefreighter.exceptions.SpaceShipControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author Daddy
 */
public class GameControl {

    public static Player createPlayer(String playersName) throws GameControlException {
        
        Player player = new Player();
        player.setPlayerName(playersName);
        
        SpaceFreighter.setPlayer(player);
        
        return player;
    }

    public static void creatNewGame(Player player) {
        
        Game game = new Game();
        SpaceFreighter.setCurrentGame(game);
        
        SpaceFreighter.setPlayer(player);
        
        InventoryItem[] inventoryList = ItemControl.createInventoryList();
        game.setInventory(inventoryList);
        
        SpaceShip spaceShip = new SpaceShip();
        game.setSpaceShip(spaceShip);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        JobBoardScene[] jobBoard = JobBoardSceneControl.createJobBoard();
        game.setJobBoard(jobBoard);
        
        TrainingRoom[] skillPoints = TrainingRoomControl.createSkillPoint();
        Game.setSkillPoints(skillPoints);        
                        
    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
    }

    public static void getSavedGame(String filePath) throws GameControlException, JobBoardSceneControlException, SpaceShipControlException {
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream("C:/SpaceGame/" + filePath + ".txt")) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        SpaceFreighter.setCurrentGame(game);
        ItemControl.getSavedInventory(filePath);
        Map map = MapControl.createMap();
        game.setMap(map);
        JobBoardSceneControl.getSavedJobBoard(filePath);
        SpaceShipControl.getSavedSpaceShip(filePath);
        
    }


}
