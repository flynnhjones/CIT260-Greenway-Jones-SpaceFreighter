/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.InventoryItem;
import cit.byui.cit260.spacefreighter.exceptions.GameControlException;
import cit.byui.cit260.spacefreighter.exceptions.ItemControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Daddy
 */
public class ItemControl {
    
    public static InventoryItem[] createInventoryList() {
        
        InventoryItem[] inventory = new InventoryItem[Item.values().length];
                
        InventoryItem currency = new InventoryItem();
        currency.setItemName("Currency");
        currency.setQuantity(2000);
        currency.setValue(1);
        currency.setType("Money");
        inventory[0] = currency;
        inventory[ItemControl.Item.currency.ordinal()] = currency;
        
        InventoryItem coolingFan = new InventoryItem();
        coolingFan.setItemName("Cooling Fan");
        coolingFan.setQuantity(0);
        coolingFan.setValue(100);
        coolingFan.setType("Ship Part");
        inventory[1] = coolingFan;
        inventory[ItemControl.Item.coolingFan.ordinal()] = coolingFan;
        
        InventoryItem hualPiece = new InventoryItem();
        hualPiece.setItemName("A Piece Hual");
        hualPiece.setQuantity(0);
        hualPiece.setValue(100);
        hualPiece.setType("Ship Part");
        inventory[2] = hualPiece;
        inventory[ItemControl.Item.hualPiece.ordinal()] = hualPiece;
        
        InventoryItem bigGun = new InventoryItem();
        bigGun.setItemName("A very large laser gun.");
        bigGun.setQuantity(0);
        bigGun.setValue(100);
        bigGun.setType("Ship Part");
        inventory[3] = bigGun;
        inventory[ItemControl.Item.bigGun.ordinal()] = bigGun;
        
        InventoryItem knife = new InventoryItem();
        knife.setItemName("Nice little knife.");
        knife.setQuantity(1);
        knife.setValue(100);
        knife.setType("weapon");
        inventory[4] = knife;
        inventory[ItemControl.Item.knife.ordinal()] = knife;
        
        InventoryItem sword = new InventoryItem();
        sword.setItemName("Good for slashing monsters.");
        sword.setQuantity(0);
        sword.setValue(500);
        sword.setType("weapon");
        inventory[5] = sword;
        inventory[ItemControl.Item.sword.ordinal()] = sword;
        
        InventoryItem laserPistol = new InventoryItem();
        laserPistol.setItemName("Pistol. Shoots lasers.");
        laserPistol.setQuantity(0);
        laserPistol.setValue(1000);
        laserPistol.setType("weapon");
        inventory[6] = laserPistol;
        inventory[ItemControl.Item.laserPistol.ordinal()] = laserPistol;
        
        return inventory;
        }
    
        public static InventoryItem[] getSortedInventoryList() {
        System.out.println("\n*** getSortedInventoryList stub function called ***");
        return null;
    }

    public static int findValue(InventoryItem[] inventory) throws ItemControlException {
        int value = 0;
        for (InventoryItem item : inventory) {
            if(item.getQuantity() < 0) {
                throw new ItemControlException("Did you cheat? You can't have negative items!");
            }
            else if(item.value < 0) {
                throw new ItemControlException("Did you cheat? You can't have negative value!");
            } else {
            value = value + (item.getQuantity() * item.value);
            }
        }
        return value;
    }

    public static void saveInventory(InventoryItem[] inventory, String filePath) throws GameControlException {
        
        try(FileOutputStream fops = new FileOutputStream("C:/SpaceGame/item." + filePath + ".txt")) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(inventory);
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
    }
    }

    static void getSavedInventory(String filePath) throws GameControlException {
        try(FileInputStream fips = new FileInputStream("C:/SpaceGame/item." + filePath + ".txt")) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            Game.inventory = (InventoryItem[]) input.readObject();
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
        public enum Item {
            currency,
            coolingFan,
            hualPiece,
            bigGun, 
            knife, 
            sword, 
            laserPistol; 
        }
    }
