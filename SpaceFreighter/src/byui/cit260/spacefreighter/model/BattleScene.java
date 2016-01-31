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
 * @author Benjamin
 */
public class BattleScene implements Serializable{
    
    private String enemyType;
    private int enemyAttack;
    private int enemyDefense;
    private int enemyexp;
    private int enemygold;
    private int playerAttack;
    private int playerDefense;
    private String availableActions;

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public int getEnemyAttack() {
        return enemyAttack;
    }

    public void setEnemyAttack(int enemyAttack) {
        this.enemyAttack = enemyAttack;
    }

    public int getEnemyDefense() {
        return enemyDefense;
    }

    public void setEnemyDefense(int enemyDefense) {
        this.enemyDefense = enemyDefense;
    }

    public int getEnemyexp() {
        return enemyexp;
    }

    public void setEnemyexp(int enemyexp) {
        this.enemyexp = enemyexp;
    }

    public int getEnemygold() {
        return enemygold;
    }

    public void setEnemygold(int enemygold) {
        this.enemygold = enemygold;
    }

    public int getPlayerAttack() {
        return playerAttack;
    }

    public void setPlayerAttack(int playerAttack) {
        this.playerAttack = playerAttack;
    }

    public int getPlayerDefense() {
        return playerDefense;
    }

    public void setPlayerDefense(int playerDefense) {
        this.playerDefense = playerDefense;
    }

    public String getAvailableActions() {
        return availableActions;
    }

    public void setAvailableActions(String availableActions) {
        this.availableActions = availableActions;
    }

    public BattleScene() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.enemyType);
        hash = 67 * hash + this.enemyAttack;
        hash = 67 * hash + this.enemyDefense;
        hash = 67 * hash + this.enemyexp;
        hash = 67 * hash + this.enemygold;
        hash = 67 * hash + this.playerAttack;
        hash = 67 * hash + this.playerDefense;
        hash = 67 * hash + Objects.hashCode(this.availableActions);
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
        final BattleScene other = (BattleScene) obj;
        if (this.enemyAttack != other.enemyAttack) {
            return false;
        }
        if (this.enemyDefense != other.enemyDefense) {
            return false;
        }
        if (this.enemyexp != other.enemyexp) {
            return false;
        }
        if (this.enemygold != other.enemygold) {
            return false;
        }
        if (this.playerAttack != other.playerAttack) {
            return false;
        }
        if (this.playerDefense != other.playerDefense) {
            return false;
        }
        if (!Objects.equals(this.enemyType, other.enemyType)) {
            return false;
        }
        if (!Objects.equals(this.availableActions, other.availableActions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BattleScene{" + "enemyType=" + enemyType + ", enemyAttack=" + enemyAttack + ", enemyDefense=" + enemyDefense + ", enemyexp=" + enemyexp + ", enemygold=" + enemygold + ", playerAttack=" + playerAttack + ", playerDefense=" + playerDefense + ", availableActions=" + availableActions + '}';
    }
    
    
}
