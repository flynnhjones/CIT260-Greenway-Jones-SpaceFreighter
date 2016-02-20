/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Player;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author Daddy
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setPlayerName(playersName);
        
        SpaceFreighter.setPlayer(player);
        
        return player;
    }

    public static void creatNewGame(Player player) {
        System.out.println("We did it again");
    }
}
