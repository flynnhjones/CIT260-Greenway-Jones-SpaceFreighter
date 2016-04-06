/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.InventoryItem;
import byui.cit260.spacefreighter.model.Map;
import byui.cit260.spacefreighter.model.Scene;
import cit.byui.cit260.spacefreighter.exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Daddy
 */
public class MapControl {

       public static Map createMap(){
        
        Map map = new Map(7, 7);
        
        Scene[] scenes = SceneControl.createScenes();
        
        LocationControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void moveActorsToStartLocation(Map map) {
        System.out.println("This is move actors");
    }    

    static void getSavedMap(String filePath) throws GameControlException {
        try(FileInputStream fips = new FileInputStream("C:/SpaceGame/map." + filePath + ".txt")) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            Game.map = (Map) input.readObject();
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
}
