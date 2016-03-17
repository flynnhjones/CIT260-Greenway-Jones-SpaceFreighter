/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.JobBoardScene;
import java.util.ArrayList;





/**
 *
 * @author Daddy
 */
public class JobBoardSceneControl {
    
    
    
    public static ArrayList<JobBoardScene> jobBoardScenes(){
    
        ArrayList<JobBoardScene> jobBoardScenes = new ArrayList<>();
        
            JobBoardScene gatherSpaceChickens = new JobBoardScene();
            gatherSpaceChickens.setJobDescription("\nAn old lady has asked you to gather her missing space chickens.");
            gatherSpaceChickens.setJobType("Non-battle job");
            gatherSpaceChickens.setJobDifficulty(1);
            

            JobBoardScene insertJobSceneHere1 = new JobBoardScene();
            insertJobSceneHere1.setJobDescription("\nInsert Job description here");
            insertJobSceneHere1.setJobType("Non-battle job");
            insertJobSceneHere1.setJobDifficulty(1);
            
            
            JobBoardScene insertJobSceneHere2 = new JobBoardScene();
            insertJobSceneHere2.setJobDescription("\nInsert Job description here");
            insertJobSceneHere2.setJobType("Non-battle job");
            insertJobSceneHere1.setJobDifficulty(1);
            
            
            JobBoardScene insertJobSceneHere3 = new JobBoardScene();
            insertJobSceneHere3.setJobDescription("\nInsert Job description here");
            insertJobSceneHere3.setJobType("Non-battle job");
            insertJobSceneHere1.setJobDifficulty(2);
                      
            JobBoardScene insertJobSceneHere4 = new JobBoardScene();
            insertJobSceneHere4.setJobDescription("\nInsert Job description here");
            insertJobSceneHere4.setJobType("Non-battle job");
            insertJobSceneHere1.setJobDifficulty(2);
            
            
            JobBoardScene insertJobSceneHere5 = new JobBoardScene();
            insertJobSceneHere5.setJobDescription("\nInsert Job description here");
            insertJobSceneHere5.setJobType("Non-battle job");
            insertJobSceneHere1.setJobDifficulty(2);
            
            
            JobBoardScene insertJobSceneHere6 = new JobBoardScene();
            insertJobSceneHere6.setJobDescription("\nInsert Job description here");
            insertJobSceneHere6.setJobType("Non-battle job");
            insertJobSceneHere1.setJobDifficulty(3);
            
            
            JobBoardScene insertJobSceneHere7 = new JobBoardScene();
            insertJobSceneHere7.setJobDescription("\nInsert Job description here");
            insertJobSceneHere7.setJobType("Non-battle job");
            insertJobSceneHere1.setJobDifficulty(3);
            
            
            JobBoardScene insertJobSceneHere8 = new JobBoardScene();
            insertJobSceneHere8.setJobDescription("\nInsert Job description here");
            insertJobSceneHere8.setJobType("Non-battle job");
            insertJobSceneHere1.setJobDifficulty(3);
            
            
            JobBoardScene insertJobSceneHere9 = new JobBoardScene();
            insertJobSceneHere9.setJobDescription("\nInsert Job description here");
            insertJobSceneHere9.setJobType("Non-battle job");
            insertJobSceneHere1.setJobDifficulty(4);
            
        
     return jobBoardScenes;   
    }



}