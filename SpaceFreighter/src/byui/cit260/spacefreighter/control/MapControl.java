/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Map;
import byui.cit260.spacefreighter.model.Scene;

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
    
}
