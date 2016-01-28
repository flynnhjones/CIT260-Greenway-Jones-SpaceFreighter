/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefreighter;

import byui.cit260.spacefreighter.model.Player;

/**
 *
 * @author Daddy
 */
public class SpaceFreighter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerName = new Player();
        
        playerName.setPlayerName("Flynn The Man");
        playerName.setGender("Male");
        
        String playerInfo = playerName.toString();
        System.out.println(playerInfo);
        
    }
    
}
