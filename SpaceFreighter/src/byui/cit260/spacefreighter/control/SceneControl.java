/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.Location;
import byui.cit260.spacefreighter.model.Map;
import byui.cit260.spacefreighter.model.Scene;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author jaxom
 */
public class SceneControl {
    
    public static Scene[] createScenes() {
        Game game = SpaceFreighter.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("\nYou have just came into stuff stuff stuff");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene coolingFanScene = new Scene();
        coolingFanScene.setDescription("\nYou need a cooling fan");
        coolingFanScene.setMapSymbol("CF");
        coolingFanScene.setBlocked(false);
        scenes[SceneType.coolingFan.ordinal()] = coolingFanScene;
        
        Scene hualPieceScene = new Scene();
        hualPieceScene.setDescription("\nYou need a piece of metal to repair your damaged hual.");
        hualPieceScene.setMapSymbol("HP");
        hualPieceScene.setBlocked(false);
        scenes[SceneType.hualPiece.ordinal()] = hualPieceScene;
        
        Scene bigGunScene = new Scene();
        bigGunScene.setDescription("\nSpace is not good, you need a space ship laser gun.!");
        bigGunScene.setMapSymbol("BG");
        bigGunScene.setBlocked(false);
        scenes[SceneType.bigGun.ordinal()] = bigGunScene;
        
        Scene blankScene = new Scene();
        blankScene.setDescription("\nSpace is not good, you need a space ship laser gun.!");
        blankScene.setMapSymbol("--");
        blankScene.setBlocked(false);
        scenes[SceneType.blank.ordinal()] = blankScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("\nYou can retire!");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }
    
    public enum SceneType {
        start,
        coolingFan,
        hualPiece,
        bigGun,
        blank,
        finish;
        
    }
}
