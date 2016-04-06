/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.InventoryItem;

/**
 *
 * @author Daddy
 */
public class CurrencyControl {

    public static void addCurrency(int i) {
        InventoryItem[] inventory = Game.inventory;
        int currency = inventory[ItemControl.Item.currency.ordinal()].getQuantity() + i;
        inventory[ItemControl.Item.currency.ordinal()].setQuantity(currency);
    }

    static void removeCurrency(int i) {
        InventoryItem[] inventory = Game.inventory;
        int currency = inventory[ItemControl.Item.currency.ordinal()].getQuantity() - i;
        inventory[ItemControl.Item.currency.ordinal()].setQuantity(currency);
    }
    
}
