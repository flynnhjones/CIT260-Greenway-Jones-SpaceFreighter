package byui.cit260.spacefreighter.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Flynn
 */
public class InventoryItem implements Serializable{
   
    //class instance variables
    private int quantity;
    private String itemName;

    public InventoryItem() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.quantity;
        hash = 41 * hash + Objects.hashCode(this.itemName);
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "quantity=" + quantity + ", itemName=" + itemName + '}';
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
       
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        return true;
    }
    
}
