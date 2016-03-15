/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.model;

import java.util.Objects;

/**
 *
 * @author jaxom
 */
public class Scene {
    private String sceneType;
    private String description;
    public String mapSymbol;
    private boolean blocked;

    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.sceneType);
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.mapSymbol);
        hash = 37 * hash + (this.blocked ? 1 : 0);
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
        final Scene other = (Scene) obj;
        if (this.blocked != other.blocked) {
            return false;
        }
        if (!Objects.equals(this.sceneType, other.sceneType)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "sceneType=" + sceneType + ", description=" + description + ", mapSymbol=" + mapSymbol + ", blocked=" + blocked + '}';
    }

   

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
