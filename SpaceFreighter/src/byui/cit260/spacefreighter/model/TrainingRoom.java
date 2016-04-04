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
public class TrainingRoom {
    int skillPoint;
    int skillAmount;
    String skillType;

    public int getSkillPoint() {
        return skillPoint;
    }

    public void setSkillPoint(int skillPoint) {
        this.skillPoint = skillPoint;
    }

    public int getSkillAmount() {
        return skillAmount;
    }

    public void setSkillAmount(int skillAmount) {
        this.skillAmount = skillAmount;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.skillPoint;
        hash = 41 * hash + this.skillAmount;
        hash = 41 * hash + Objects.hashCode(this.skillType);
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
        final TrainingRoom other = (TrainingRoom) obj;
        if (this.skillPoint != other.skillPoint) {
            return false;
        }
        if (this.skillAmount != other.skillAmount) {
            return false;
        }
        if (!Objects.equals(this.skillType, other.skillType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrainingRoom{" + "skillPoint=" + skillPoint + ", skillAmount=" + skillAmount + ", skillType=" + skillType + '}';
    }                    
}
