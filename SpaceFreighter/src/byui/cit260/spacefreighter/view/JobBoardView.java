/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.JobBoardSceneControl;
import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.JobBoardScene;
import byui.cit260.spacefreighter.model.SpaceShip;
import cit.byui.cit260.spacefreighter.exceptions.JobBoardSceneControlException;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daddy
 */
public class JobBoardView extends SuperView {
    
    static int choice = 0;

   
    
        
    public JobBoardView() {
        super("\n"
                + "\n--------------------------------"
                + "\n Job Board                     |"
                + "\n-------------------------------|"                
                + "\nJ - Choose a job to do         |"
                + "\nP - Print Job list             |"
                + "\nQ - Go back                    |"
                + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {            
            case "J":        
        {
            try {
                this.chooseJob();
            } catch (IOException ex) {
                ErrorView.display("JobBoardView choosing jobs", ex.getMessage());
            }
        }
                break;
            case "P":
        { try {
                this.printJobList();
            } catch (IOException ex) {
                ErrorView.display("JobBoardView", ex.getMessage());
            }
        }
                
            default:
                this.console.println();
                break;
        }
        
        return false;
    }
    

    private void displayJobBoardScenes() throws JobBoardSceneControlException {
      
        JobBoardScene[] jobBoard = Game.jobBoard;
        this.console.println("\nList of Jobs");
        this.console.println("Description" + "\t" + "Job Difficulty level" + "\t Completed?");
        for(JobBoardScene jobBoardScene : jobBoard) {
        this.console.println(jobBoardScene.getJobDescription() + "\t     " + jobBoardScene.getJobDifficulty() + "\t   " + jobBoardScene.isCompleted());
      }
    }
    
    
    private void doBattle() {
        BattleMenuView battleMenu = new BattleMenuView();
        battleMenu.display();
    } 
 
    public void printJobList() throws IOException {
        this.console.println("Enter the name of your filepath");
        String filePath = this.keyboard.readLine();
        try{
        JobBoardSceneControl.printJobList(filePath);
        } catch (Exception ex) {
            ErrorView.display("Error, it did not print", ex.getMessage());
        }
        this.console.println( "Inventory sent to C:/SpaceGame/joblist." + filePath + ".txt.");
    }

    private void chooseJob() throws IOException {
        JobBoardScene[] jobBoard = Game.jobBoard;
        this.console.println("\nList of Jobs");
        this.console.println("Description" + "\t" + "Job Difficulty level" + "\t Reward");
        int jobNumber = 1;
        for(JobBoardScene jobBoardScene : jobBoard) {
            if(jobBoardScene.isCompleted() == false){
        this.console.println("\n" + jobNumber + ". " + jobBoardScene.getJobDescription() + "\t     " + jobBoardScene.getJobDifficulty() + "\t" + jobBoardScene.getReward());
            }
        jobNumber++;
            
      }
        this.console.println("Choose a job. Press Q to quit.");
        String response = this.keyboard.readLine();        
        try {choice = parseInt(response);
        } catch (NumberFormatException ex) {
            ErrorView.display("JobBoardView", ex.getMessage());
        }
        if (choice > jobBoard.length || choice < 1) {
            this.console.println("***Invalid Selection, Try Again***");
            
    }
        SpaceShip ship = Game.getSpaceShip();
        if (ship.durability < 1 || ship.fuelGauge < 1) {
            JobBoardSceneControl.console.println("Your ship is in no position to fly! Get it repaired and refueled!");
            return;
        }
        JobBoardSceneControl.startJob(choice);
    }
}
