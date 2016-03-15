/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.InventoryItem;
import byui.cit260.spacefreighter.model.Map;
import byui.cit260.spacefreighter.model.Player;
import byui.cit260.spacefreighter.model.SpaceShip;
import byui.cit260.spacefreighter.view.GameMenuView;
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
        
        Game game = new Game();
        SpaceFreighter.setCurrentGame(game);
        
        SpaceFreighter.setPlayer(player);
        
        InventoryItem[] inventoryList = ItemControl.createIventoryList();
        game.setInventory(inventoryList);
        
        SpaceShip spaceShip = new SpaceShip();
        game.setSpaceShip(spaceShip);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartLocation(map);
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private static InventoryItem[] createIventoryList() {
        
        InventoryItem[] inventory = new InventoryItem[4];
                
        InventoryItem currency = new InventoryItem();
        currency.setItemName("Currency");
        currency.setQuantity(0);
        inventory[0] = currency;
        inventory[Item.currency.ordinal()] = currency;
        
        InventoryItem coolingFan = new InventoryItem();
        coolingFan.setItemName("Cooling Fan");
        coolingFan.setQuantity(0);
        inventory[1] = coolingFan;
        inventory[Item.coolingFan.ordinal()] = coolingFan;
        
        InventoryItem hualPiece = new InventoryItem();
        hualPiece.setItemName("A Piece Hual");
        hualPiece.setQuantity(0);
        inventory[2] = hualPiece;
        inventory[Item.hualPiece.ordinal()] = hualPiece;
        
        InventoryItem bigGun = new InventoryItem();
        bigGun.setItemName("A very large laser gun.");
        bigGun.setQuantity(0);
        inventory[3] = bigGun;
        inventory[Item.bigGun.ordinal()] = bigGun;
        
        return inventory;
        }

  public static InventoryItem[] getSortedInventoryList() {
        System.out.println("\n*** getSortedInventoryList stub function called ***");
        return null;
    }

    
        
        public enum Item {
            currency,
            coolingFan,
            hualPiece,
            bigGun; 
        }
    }
