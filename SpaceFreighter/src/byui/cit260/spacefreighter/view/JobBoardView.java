/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.GameControl;
import byui.cit260.spacefreighter.control.JobBoardSceneControl;
import byui.cit260.spacefreighter.model.Game;
import static byui.cit260.spacefreighter.model.Game.jobBoard;
import byui.cit260.spacefreighter.model.JobBoardScene;
import cit.byui.cit260.spacefreighter.exceptions.JobBoardSceneControlException;
import java.io.CharArrayWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author Daddy
 */
public class JobBoardView extends SuperView {
    
        
    public JobBoardView() {
        super("\n"
                + "\n-----------------------------"
                + "\n Job Board                   |"
                + "\n-----------------------------"
                +"\nB - Battle Jobs               |"
                + "\nN - Display Non Battle Jobs  |"
                +"\nQ - Go back                   |"
                +"\n------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "B":
                this.doBattle();
                break;
            case "N":
        {
            try {
                this.displayJobBoardScenes();
            } catch (JobBoardSceneControlException ex) {
               ErrorView.display("JobBoardView", ex.getMessage());
            }
        }
            case "P":
                this.savePrintJobList();
            default:
                this.console.println("\n*** Invalid selection *** Try again");
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

    private void savePrintJobList() {
        
    }
    }
