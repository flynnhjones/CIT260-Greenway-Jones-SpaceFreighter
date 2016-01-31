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
    
    private int numberOfJobs;
    private String jobType;
    private String jobLocation;

    public int getNumberOfJobs() {
        return numberOfJobs;
    }

    public void setNumberOfJobs(int numberOfJobs) {
        this.numberOfJobs = numberOfJobs;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public JobBoardScene() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.numberOfJobs;
        hash = 17 * hash + Objects.hashCode(this.jobType);
        hash = 17 * hash + Objects.hashCode(this.jobLocation);
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
        if (this.numberOfJobs != other.numberOfJobs) {
            return false;
        }
        if (!Objects.equals(this.jobType, other.jobType)) {
            return false;
        }
        if (!Objects.equals(this.jobLocation, other.jobLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JobBoardScene{" + "numberOfJobs=" + numberOfJobs + ", jobType=" + jobType + ", jobLocation=" + jobLocation + '}';
    }
    
    
}
