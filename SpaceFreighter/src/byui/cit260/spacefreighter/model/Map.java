/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.model;

import java.io.Serializable;
import java.util.Arrays;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author Flynn
 */
public class Map implements Serializable{

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
        bigGunScene.setDescription("\nSpace is not good, you need a space ship laser gun!");
        bigGunScene.setMapSymbol("BG");
        bigGunScene.setBlocked(false);
        scenes[SceneType.bigGun.ordinal()] = bigGunScene;
        
        Scene blankScene = new Scene();
        blankScene.setDescription("\nEMPTY SPACE!");
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
    
    private int noOfRows;
    private int noOfColumns;
    private Locations[][] locations;
    
    public Map(int noOfRows, int noOfColumns){
    
        if (noOfRows < 1 || noOfColumns < 1){
            System.out.println("The number of rows and columns must be greater than zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Locations[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for(int column = 0; column < noOfColumns; column++) {
                
                Locations location = new Locations();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(true);
                
                locations[row][column] = location;
            }
        }
    }
    
     public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public Locations[][] getLocations() {
        return locations; 
    }

    public void setLocations(Locations[][] locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.noOfRows;
        hash = 83 * hash + this.noOfColumns;
        hash = 83 * hash + Arrays.deepHashCode(this.locations);
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
        final Map other = (Map) obj;
        if (this.noOfRows != other.noOfRows) {
            return false;
        }
        if (this.noOfColumns != other.noOfColumns) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + ", locations=" + locations + '}';
    }
}
