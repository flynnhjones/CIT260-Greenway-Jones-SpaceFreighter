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
public class Inventory implements Serializable{
   
    //class instance variables
    private int quantity;
    private String inventoryType;

    public Inventory() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.quantity;
        hash = 97 * hash + Objects.hashCode(this.inventoryType);
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "quantity=" + quantity + ", inventoryType=" + inventoryType + '}';
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
        final Inventory other = (Inventory) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
