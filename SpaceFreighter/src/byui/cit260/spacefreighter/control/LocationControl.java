/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Location;
import byui.cit260.spacefreighter.model.Map;
import byui.cit260.spacefreighter.model.Scene;

/**
 *
 * @author jaxom
 */
public class LocationControl {
    
    public static Location[][] assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneControl.SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneControl.SceneType.coolingFan.ordinal()]);
        locations[0][2].setScene(scenes[SceneControl.SceneType.hualPiece.ordinal()]);
        locations[0][3].setScene(scenes[SceneControl.SceneType.bigGun.ordinal()]);
        locations[0][4].setScene(scenes[SceneControl.SceneType.finish.ordinal()]);
        locations[0][5].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[0][6].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[1][0].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[1][1].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[1][2].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[1][3].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[1][4].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[1][5].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[1][6].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[2][0].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[2][1].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[2][2].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[2][3].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[2][4].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[2][5].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[2][6].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[3][0].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[3][1].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[3][2].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[3][3].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[3][4].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[3][5].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[3][6].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[4][0].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[4][1].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[4][2].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[4][3].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[4][4].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[4][5].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[4][6].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[5][0].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[5][1].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[5][2].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[5][3].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[5][4].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[5][5].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[5][6].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[6][0].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[6][1].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[6][2].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[6][3].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[6][4].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[6][5].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        locations[6][6].setScene(scenes[SceneControl.SceneType.blank.ordinal()]);
        
        return locations;
    }
    
}
