/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.InventoryItem;

/**
 *
 * @author Daddy
 */
public class ItemControl {
    
    public static InventoryItem[] createIventoryList() {
        
        InventoryItem[] inventory = new InventoryItem[4];
                
        InventoryItem currency = new InventoryItem();
        currency.setItemName("Currency");
        currency.setQuantity(0);
        inventory[0] = currency;
        inventory[ItemControl.Item.currency.ordinal()] = currency;
        
        InventoryItem coolingFan = new InventoryItem();
        coolingFan.setItemName("Cooling Fan");
        coolingFan.setQuantity(0);
        inventory[1] = coolingFan;
        inventory[ItemControl.Item.coolingFan.ordinal()] = coolingFan;
        
        InventoryItem hualPiece = new InventoryItem();
        hualPiece.setItemName("A Piece Hual");
        hualPiece.setQuantity(0);
        inventory[2] = hualPiece;
        inventory[ItemControl.Item.hualPiece.ordinal()] = hualPiece;
        
        InventoryItem bigGun = new InventoryItem();
        bigGun.setItemName("A very large laser gun.");
        bigGun.setQuantity(0);
        inventory[3] = bigGun;
        inventory[ItemControl.Item.bigGun.ordinal()] = bigGun;
        
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
