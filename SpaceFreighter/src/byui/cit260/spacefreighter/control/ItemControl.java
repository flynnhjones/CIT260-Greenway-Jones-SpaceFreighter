/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.InventoryItem;
import byui.cit260.spacefreighter.view.ErrorView;
import cit.byui.cit260.spacefreighter.exceptions.GameControlException;
import cit.byui.cit260.spacefreighter.exceptions.ItemControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Daddy
 */
public class ItemControl {
    
    public static InventoryItem[] createInventoryList() {
        
        InventoryItem[] inventory = new InventoryItem[Item.values().length];
                
        InventoryItem currency = new InventoryItem();
        currency.setItemName("Space Bucks");
        currency.setQuantity(2000);
        currency.setValue(1);
        currency.setType("Money");
        inventory[0] = currency;
        inventory[ItemControl.Item.currency.ordinal()] = currency;
        
        InventoryItem coolingFan = new InventoryItem();
        coolingFan.setItemName("Cooling Fan");
        coolingFan.setQuantity(1);
        coolingFan.setValue(100);
        coolingFan.setType("Ship Part");
        inventory[1] = coolingFan;
        inventory[ItemControl.Item.coolingFan.ordinal()] = coolingFan;
        
        InventoryItem hualPiece = new InventoryItem();
        hualPiece.setItemName("A hual piece");
        hualPiece.setQuantity(1);
        hualPiece.setValue(100);
        hualPiece.setType("Ship Part");
        inventory[2] = hualPiece;
        inventory[ItemControl.Item.hualPiece.ordinal()] = hualPiece;
        
        InventoryItem bigGun = new InventoryItem();
        bigGun.setItemName("Ship Gun");
        bigGun.setQuantity(1);
        bigGun.setValue(100);
        bigGun.setType("Ship Part");
        inventory[3] = bigGun;
        inventory[ItemControl.Item.bigGun.ordinal()] = bigGun;
        
        InventoryItem knife = new InventoryItem();
        knife.setItemName("Knife");
        knife.setQuantity(1);
        knife.setValue(100);
        knife.setType("weapon");
        inventory[4] = knife;
        inventory[ItemControl.Item.knife.ordinal()] = knife;
        
        InventoryItem sword = new InventoryItem();
        sword.setItemName("Sword");
        sword.setQuantity(0);
        sword.setValue(500);
        sword.setType("weapon");
        inventory[5] = sword;
        inventory[ItemControl.Item.sword.ordinal()] = sword;
        
        InventoryItem laserPistol = new InventoryItem();
        laserPistol.setItemName("Laser Pistol");
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

    public static void printInventoryList(String filePath) {
        InventoryItem[] items = Game.inventory;
        int value = 0;
        int itemValue = 0;
        try {
            value = ItemControl.findValue(items);            
        } catch (ItemControlException ex) {
            ErrorView.display("Print couldn't get value", ex.getMessage());
        }
        try(PrintWriter out = new PrintWriter("C:/SpaceGame/itemprintreport." + filePath + ".txt")) {
            
            out.println("\n         Inventory List      ");
            out.printf("%n%-15s%-15s%15s%15s", "Item Name", "Quantity", "Value per item", "Value");
            out.printf("%n%-15s%-15s%15s%15s", "---------", "--------", "--------------", "-----");
            
            for (InventoryItem item : items) {
                if(item.quantity > 0) {
                    itemValue = item.quantity * item.value;
                out.printf("%n%-15s%-15s%15s%15s", item.getItemName(), item.quantity, item.value, itemValue);
                }
            }
            out.printf("%n%60s", "------------------------------------------------------------");
            out.printf("%n%-11s%49s", "Total Value", value + " Space Bucks");
                
        }
        catch(Exception e) {
            ErrorView.display("Inventory Didn't print", e.getMessage());
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
