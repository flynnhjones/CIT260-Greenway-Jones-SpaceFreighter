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
    
    private String jobDescription;
    private String jobType;
    private int jobDifficulty;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.jobDescription);
        hash = 59 * hash + Objects.hashCode(this.jobType);
        hash = 59 * hash + this.jobDifficulty;
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
        return "JobBoardScene{" + "jobDescription=" + jobDescription + ", jobType=" + jobType + ", jobDifficulty=" + jobDifficulty + '}';
    }
}

