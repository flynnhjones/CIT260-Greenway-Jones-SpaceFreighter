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
public class JobBoardScene implements Serializable{
    
    public String jobDescription;
    public String jobType;
    public int jobDifficulty;
    public int reward;
    public boolean completed;
    
    public int getJobDifficulty() {
        return jobDifficulty;
    }

    public void setJobDifficulty(int jobDifficulty) {
        this.jobDifficulty = jobDifficulty;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.jobDescription);
        hash = 47 * hash + Objects.hashCode(this.jobType);
        hash = 47 * hash + this.jobDifficulty;
        hash = 47 * hash + this.reward;
        hash = 47 * hash + (this.completed ? 1 : 0);
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
        final JobBoardScene other = (JobBoardScene) obj;
        if (this.jobDifficulty != other.jobDifficulty) {
            return false;
        }
        if (this.reward != other.reward) {
            return false;
        }
        if (this.completed != other.completed) {
            return false;
        }
        if (!Objects.equals(this.jobDescription, other.jobDescription)) {
            return false;
        }
        if (!Objects.equals(this.jobType, other.jobType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JobBoardScene{" + "jobDescription=" + jobDescription + ", jobType=" + jobType + ", jobDifficulty=" + jobDifficulty + ", reward=" + reward + ", completed=" + completed + '}';
    }

}

