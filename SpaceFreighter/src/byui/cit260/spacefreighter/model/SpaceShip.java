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
 * @author Flynn
 */
public class SpaceShip implements Serializable{
    
    //class instance variables
    private String shipName;
    public int durability;
    public int fuelGauge;

    public SpaceShip() {
        this.durability = 100;
        this.fuelGauge = 100;
        this.shipName = "\nHalf a ship.";
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getFuelCapacity() {
        return fuelGauge;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelGauge = fuelCapacity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.shipName);
        hash = 53 * hash + this.durability;
        hash = 53 * hash + this.fuelGauge;
        return hash;
    }

    @Override
    public String toString() {
        return "SpaceShip{" + "shipName=" + shipName + ", durability=" + durability + ", fuelCapacity=" + fuelGauge + '}';
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
        final SpaceShip other = (SpaceShip) obj;
        if (this.durability != other.durability) {
            return false;
        }
        if (this.fuelGauge != other.fuelGauge) {
            return false;
        }
        if (!Objects.equals(this.shipName, other.shipName)) {
            return false;
        }
        return true;
    }
    
    
}
