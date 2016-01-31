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
public class CrewSkillPoints implements Serializable{
    
    private String skillType;
    private int skillQuantity;

    public CrewSkillPoints() {
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    public int getSkillQuantity() {
        return skillQuantity;
    }

    public void setSkillQuantity(int skillQuantity) {
        this.skillQuantity = skillQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.skillType);
        hash = 37 * hash + this.skillQuantity;
        return hash;
    }

    @Override
    public String toString() {
        return "CrewSkillPoints{" + "skillType=" + skillType + ", skillQuantity=" + skillQuantity + '}';
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
        final CrewSkillPoints other = (CrewSkillPoints) obj;
        if (this.skillQuantity != other.skillQuantity) {
            return false;
        }
        if (!Objects.equals(this.skillType, other.skillType)) {
            return false;
        }
        return true;
    }
   
    
}
