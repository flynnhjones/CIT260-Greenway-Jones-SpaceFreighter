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
import byui.cit260.spacefreighter.model.Inventory;
import byui.cit260.spacefreighter.model.JobBoardScene;
import byui.cit260.spacefreighter.model.Locations;
import byui.cit260.spacefreighter.model.Map;
import byui.cit260.spacefreighter.model.Player;
import byui.cit260.spacefreighter.model.RegularScene;
import byui.cit260.spacefreighter.model.ShopScene;
import byui.cit260.spacefreighter.model.SpaceShip;

/**
 *
 * @author Benjamin/Flynn
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
        coolingFan.setItemName("Cooling Fan");
        
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
        
        //Actor class test
        Actor pilot = new Actor();
        
        pilot.setName("Bob");
        pilot.setType("NonPlayerCharactor");
        pilot.setLocation("Earth");
        pilot.setDescription("A crew member for the ship.");
        
        String actorInfo = pilot.toString();
        System.out.println(actorInfo);
        
        //Game class test
        Game game1 = new Game();
        
        game1.setNewGame("Game 1");
        game1.setSavedGame("Game 2");
        game1.setHelpMenu("You Need Help!");
        
        String GameInfo = game1.toString();
        System.out.println(GameInfo);
        
        //Locations class test
        Locations earth = new Locations();
        
        earth.setJobs("Find a Mechanic");
        earth.setLocationName("Earth");
        
        String earthLocation = earth.toString();
        System.out.println(earthLocation);
        
        //JobBoardScene class test
        JobBoardScene earthJobBoard = new JobBoardScene();
        
        earthJobBoard.setJobLocation("Mars");
        earthJobBoard.setJobType("Battle");
        earthJobBoard.setNumberOfJobs(3);
        
        String earthJobs = earthJobBoard.toString();
        System.out.println(earthJobs);
        
        //RegularScene class test
        RegularScene earthRegular = new RegularScene();
        
        earthRegular.setActors("Billybob, Giant Tortoise, Filbjok");
        earthRegular.setAvailableActions("Examine, Explore, Start Battle");
        earthRegular.setDescription("Earth is your home, but it's pretty run down. Maybe if those darn 21st century dolts had not gone to such extreme measures to fix global warming everything would be good. There's some folks here, and an empty bag on the floor.");
        
        String earthRegularScene = earthRegular.toString();
        System.out.println(earthRegularScene);
        
        //ShopScene class test
        ShopScene earthShopScene = new ShopScene();
        
        earthShopScene.setItemForSale("Sandwich");
        earthShopScene.setItemPrice(50);
        
        String earthShop = earthShopScene.toString();
        System.out.println(earthShop);
        
        //BattleScene class test
        BattleScene earthBattleScene = new BattleScene();
        
        earthBattleScene.setAvailableActions("Fight, Item, Flee");
        earthBattleScene.setEnemyAttack(10);
        earthBattleScene.setEnemyDefense(10);
        earthBattleScene.setEnemyType("Ruffian");
        earthBattleScene.setEnemyexp(10);
        earthBattleScene.setEnemygold(100);
        earthBattleScene.setPlayerAttack(15);
        earthBattleScene.setPlayerDefense(15);
        
        String earthBattle = earthBattleScene.toString();
        System.out.println(earthBattle);
    
        Map mapView = new Map();
        
        mapView.setCurrentLocation("Earth");
        mapView.setLocations("Muliple Places to go!");
        
        String mapConsole = mapView.toString();
        System.out.println(mapConsole);
    }
    
}
