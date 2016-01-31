/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Daddy
 */
public class ShopScene implements Serializable{
    
    private String itemForSale;
    private int itemPrice;

    public String getItemForSale() {
        return itemForSale;
    }

    public void setItemForSale(String itemForSale) {
        this.itemForSale = itemForSale;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public ShopScene() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.itemForSale);
        hash = 47 * hash + this.itemPrice;
        return hash;
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
        final ShopScene other = (ShopScene) obj;
        if (this.itemPrice != other.itemPrice) {
            return false;
        }
        if (!Objects.equals(this.itemForSale, other.itemForSale)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShopScene{" + "itemForSale=" + itemForSale + ", itemPrice=" + itemPrice + '}';
    }
    
    
    
}
