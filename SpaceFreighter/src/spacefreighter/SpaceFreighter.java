/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefreighter;

import byui.cit260.spacefreighter.model.CrewSkillPoints;
import byui.cit260.spacefreighter.model.Inventory;
import byui.cit260.spacefreighter.model.Player;
import byui.cit260.spacefreighter.model.SpaceShip;

/**
 *
 * @author Benjamin
 */
public class SpaceFreighter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Player class test
        Player playerName = new Player();
        
        playerName.setPlayerName("Flynn The Man");
        playerName.setGender("Male");
        
        String playerInfo = playerName.toString();
        System.out.println(playerInfo);

        //Inventory class test
        Inventory coolingFan = new Inventory();
        
        coolingFan.setQuantity(1);
        coolingFan.setInventoryType("enginePart");
        
        String playerInv = coolingFan.toString();
        System.out.println(playerInv);
        
        //Space ship class test
        SpaceShip playerShip = new SpaceShip();
        
        playerShip.setShipName("Space Virgin");
        playerShip.setDurability(75);
        playerShip.setFuelCapacity(100);
        
        String playerShipInfo = playerShip.toString();
        System.out.println(playerShipInfo);
        
        //Crew skill point test
        CrewSkillPoints point = new CrewSkillPoints();
        
        point.setSkillQuantity(5);
        point.setSkillType("Pilot");
        
        String CrewSkillPoints = point.toString();
        System.out.println(CrewSkillPoints);
        
    }
    
}
