/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.JobBoardSceneControl;
import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.JobBoardScene;
import cit.byui.cit260.spacefreighter.exceptions.JobBoardSceneControlException;
import java.io.IOException;

/**
 *
 * @author Daddy
 */
public class JobBoardView extends SuperView {
    
        
    public JobBoardView() {
        super("\n"
                + "\n--------------------------------"
                + "\n Job Board                     |"
                + "\n-------------------------------|"
                +"\nB - Battle Jobs                 |"
                + "\nN - Display Non Battle Jobs    |"
                + "\nP - Print Non Battle Job list  |"
                +"\nQ - Go back                     |"
                +"\n---------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "B":
                this.doBattle();
                break;
            case "N":
        { try {
                this.displayJobBoardScenes();
            } catch (JobBoardSceneControlException ex) {
               ErrorView.display("JobBoardView", ex.getMessage());
            }
        }
                
        
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
        this.console.println("Description" + "\t" + "Job Type" + "\t" + "Job Difficulty level");
        for(JobBoardScene jobBoardScene : jobBoard) {
        this.console.println(jobBoardScene.getJobDescription() + "\t   " + jobBoardScene.getJobType()+ "\t     " + jobBoardScene.getJobDifficulty());
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

    }
