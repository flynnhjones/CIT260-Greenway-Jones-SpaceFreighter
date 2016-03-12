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
public enum Actor implements Serializable  {
    
    //Add each actor later.
    Bob("Is the pilot."),
    Sue("Is the mechanic"),
    Charlie("Is the WS");
    
    private final Locations coordinates;
    private final String description;

    Actor(String description) {
        this.description = description;
        coordinates = new Locations();
    }

    public Locations getcoordinates() {
        return coordinates;
    }


    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Actor{" + ", coordinates=" + coordinates + ", description=" + description + '}';
    }
}