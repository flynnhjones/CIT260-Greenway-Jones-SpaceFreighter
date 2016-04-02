/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.JobBoardScene;
import cit.byui.cit260.spacefreighter.exceptions.JobBoardSceneControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import spacefreighter.SpaceFreighter;





/**
 *
 * @author Daddy
 */
public class JobBoardSceneControl {
    
    PrintWriter console = SpaceFreighter.getOutFile();
    
     public static JobBoardScene[] createJobBoard() {
        
            JobBoardScene[] jobBoard = new JobBoardScene[10];
        
            JobBoardScene gatherSpaceChickens = new JobBoardScene();
            gatherSpaceChickens.setJobDescription("\nAn old lady has asked you to gather her missing space chickens.");
            gatherSpaceChickens.setJobType("Non-battle job");
            gatherSpaceChickens.setJobDifficulty(1);
            gatherSpaceChickens.setReward(100);
            gatherSpaceChickens.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.gatherSpaceChickens.ordinal()] = gatherSpaceChickens;

            JobBoardScene insertJobSceneHere1 = new JobBoardScene();
            insertJobSceneHere1.setJobDescription("\nInsert Job description here 1");
            insertJobSceneHere1.setJobType("Non-battle job");
            insertJobSceneHere1.setJobDifficulty(1);
            insertJobSceneHere1.setReward(100);
            insertJobSceneHere1.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.insertJobSceneHere1.ordinal()] = insertJobSceneHere1;
            
            JobBoardScene insertJobSceneHere2 = new JobBoardScene();
            insertJobSceneHere2.setJobDescription("\nInsert Job description here 2");
            insertJobSceneHere2.setJobType("Non-battle job");
            insertJobSceneHere2.setJobDifficulty(1);
            insertJobSceneHere2.setReward(100);
            insertJobSceneHere2.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.insertJobSceneHere2.ordinal()] = insertJobSceneHere2;
            
            JobBoardScene insertJobSceneHere3 = new JobBoardScene();
            insertJobSceneHere3.setJobDescription("\nInsert Job description here 3");
            insertJobSceneHere3.setJobType("Non-battle job");
            insertJobSceneHere3.setJobDifficulty(2);
            insertJobSceneHere3.setReward(100);
            insertJobSceneHere3.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.insertJobSceneHere3.ordinal()] = insertJobSceneHere3;
                      
            JobBoardScene insertJobSceneHere4 = new JobBoardScene();
            insertJobSceneHere4.setJobDescription("\nInsert Job description here 4");
            insertJobSceneHere4.setJobType("Non-battle job");
            insertJobSceneHere4.setJobDifficulty(2);
            insertJobSceneHere4.setReward(100);
            insertJobSceneHere4.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.insertJobSceneHere4.ordinal()] = insertJobSceneHere4;
            
            JobBoardScene insertJobSceneHere5 = new JobBoardScene();
            insertJobSceneHere5.setJobDescription("\nInsert Job description here 5");
            insertJobSceneHere5.setJobType("Non-battle job");
            insertJobSceneHere5.setJobDifficulty(2);
            insertJobSceneHere5.setReward(100);
            insertJobSceneHere5.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.insertJobSceneHere5.ordinal()] = insertJobSceneHere5;
            
            JobBoardScene insertJobSceneHere6 = new JobBoardScene();
            insertJobSceneHere6.setJobDescription("\nInsert Job description here 6");
            insertJobSceneHere6.setJobType("Non-battle job");
            insertJobSceneHere6.setJobDifficulty(3);
            insertJobSceneHere6.setReward(100);
            insertJobSceneHere6.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.insertJobSceneHere6.ordinal()] = insertJobSceneHere6;
            
            JobBoardScene insertJobSceneHere7 = new JobBoardScene();
            insertJobSceneHere7.setJobDescription("\nInsert Job description here 7");
            insertJobSceneHere7.setJobType("Non-battle job");
            insertJobSceneHere7.setJobDifficulty(3);
            insertJobSceneHere7.setReward(100);
            insertJobSceneHere7.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.insertJobSceneHere7.ordinal()] = insertJobSceneHere7;
            
            JobBoardScene insertJobSceneHere8 = new JobBoardScene();
            insertJobSceneHere8.setJobDescription("\nInsert Job description here 8");
            insertJobSceneHere8.setJobType("Non-battle job");
            insertJobSceneHere8.setJobDifficulty(3);
            insertJobSceneHere8.setReward(100);
            insertJobSceneHere8.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.insertJobSceneHere8.ordinal()] = insertJobSceneHere8;
            
            JobBoardScene insertJobSceneHere9 = new JobBoardScene();
            insertJobSceneHere9.setJobDescription("\nInsert Job description here 9");
            insertJobSceneHere9.setJobType("Non-battle job");
            insertJobSceneHere9.setJobDifficulty(4);
            jobBoard[JobBoardSceneControl.Scene.insertJobSceneHere9.ordinal()] = insertJobSceneHere9;
        
     return jobBoard;   
    }
    
    public static void saveJobBoardScenes(JobBoardScene[] jobBoard, String filePath) throws JobBoardSceneControlException {
        
        try(FileOutputStream fops = new FileOutputStream("C:/SpaceGame/Scene." + filePath + ".txt")) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(jobBoard);
        }
        catch(Exception e) {
            throw new JobBoardSceneControlException(e.getMessage());
    }
    }

    public static void getSavedJobBoard(String filePath) throws JobBoardSceneControlException {
        try(FileInputStream fips = new FileInputStream("C:/SpaceGame/Scene." + filePath + ".txt")) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            Game.jobBoard = (JobBoardScene[]) input.readObject();
        }
        catch(Exception e) {
            throw new JobBoardSceneControlException(e.getMessage());
        }
    }
    
    public enum Scene {
        
            gatherSpaceChickens,
            insertJobSceneHere1,
            insertJobSceneHere2,
            insertJobSceneHere3,
            insertJobSceneHere4,
            insertJobSceneHere5,
            insertJobSceneHere6,
            insertJobSceneHere7,
            insertJobSceneHere8,
            insertJobSceneHere9;   
        }
}