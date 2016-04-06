/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.control;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.JobBoardScene;
import byui.cit260.spacefreighter.view.ErrorView;
import byui.cit260.spacefreighter.view.jobs.CheckOutDistressBeacon;
import byui.cit260.spacefreighter.view.jobs.DestroyMeteoroidShower;
import byui.cit260.spacefreighter.view.jobs.GatherSpaceChickens;
import byui.cit260.spacefreighter.view.jobs.RaidATown;
import byui.cit260.spacefreighter.view.jobs.SmallSettlementInTrouble;
import cit.byui.cit260.spacefreighter.exceptions.JobBoardSceneControlException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
    
    private static PrintWriter console = SpaceFreighter.getOutFile();

    public static boolean startJob(int choice) {
        
        JobBoardScene[] jobBoard = Game.jobBoard;
        if (jobBoard[choice].isCompleted() == true) {
            System.out.println("You have already done this job! Try another one!");
            return false;
        }
        
        switch(choice) {
            case 1:
                JobBoardSceneControl.gatherSpaceChickens();
                break;
            case 2:
                JobBoardSceneControl.destroyMeteoroidShower();
                break;
            case 3:
                JobBoardSceneControl.checkOutDistressBeacon();
                break;
            case 4:
                JobBoardSceneControl.smallSettlementInTrouble();
                break;
            case 5:
                JobBoardSceneControl.raidATown();
                break;
            case 6:
                JobBoardSceneControl.brokenquest();
                break;
            case 7:
                JobBoardSceneControl.brokenquest();
                break;
            case 8:
                JobBoardSceneControl.brokenquest();
                break;
            default:
                
                break;
        }
        
            return false;
    }

    public static void completeQuest(int ordinal) {
        JobBoardScene[] jobBoard = Game.jobBoard;
        jobBoard[ordinal].setCompleted(true); 
        CurrencyControl.addCurrency(jobBoard[ordinal].getReward());
        TrainingRoomControl.addUnusedSkillPoint(jobBoard[ordinal].getJobDifficulty());
        SpaceShipControl.removeFuelAndDurability();
        JobBoardSceneControl.console.println("Job complete! You earned " + jobBoard[ordinal].getReward() + " Space Bucks and " + jobBoard[ordinal].getJobDifficulty() + " job point(s)!");
    }   
    
     public static JobBoardScene[] createJobBoard() {
        
            JobBoardScene[] jobBoard = new JobBoardScene[8];
        
            JobBoardScene gatherSpaceChickens = new JobBoardScene();
            gatherSpaceChickens.setJobDescription("Gather Space Chickens.");
            gatherSpaceChickens.setJobDifficulty(1);
            gatherSpaceChickens.setReward(100);
            gatherSpaceChickens.setJobType("Awesome Job");
            gatherSpaceChickens.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.gatherSpaceChickens.ordinal()] = gatherSpaceChickens;

            JobBoardScene destroyMeteoroidShower = new JobBoardScene();
            destroyMeteoroidShower.setJobDescription("Destroy a Meteoroid field.");
            destroyMeteoroidShower.setJobDifficulty(1);
            destroyMeteoroidShower.setReward(100);
            destroyMeteoroidShower.setJobType("Amazing Job");
            destroyMeteoroidShower.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.destroyMeteoroidShower.ordinal()] = destroyMeteoroidShower;
            
            JobBoardScene checkOutDistressBeacon = new JobBoardScene();
            checkOutDistressBeacon.setJobDescription("Go Check Out a Distress Beacon.");
            checkOutDistressBeacon.setJobDifficulty(2);
            checkOutDistressBeacon.setReward(200);
            checkOutDistressBeacon.setJobType("Cool Job");
            checkOutDistressBeacon.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.checkOutDistressBeacon.ordinal()] = checkOutDistressBeacon;
            
            JobBoardScene smallSettlementInTrouble = new JobBoardScene();
            smallSettlementInTrouble.setJobDescription("Assist a Small Settlement.");
            smallSettlementInTrouble.setJobDifficulty(3);
            smallSettlementInTrouble.setJobType("Fun Job");
            smallSettlementInTrouble.setReward(500);
            smallSettlementInTrouble.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.smallSettlementInTrouble.ordinal()] = smallSettlementInTrouble;
                      
            JobBoardScene raidATown = new JobBoardScene();
            raidATown.setJobDescription("Raid a spacetown that is ran by the mob.");
            raidATown.setJobDifficulty(30);
            raidATown.setJobType("Hardest Job Ever");
            raidATown.setReward(10000);
            raidATown.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.raidATown.ordinal()] = raidATown;
            
            JobBoardScene insertJobSceneHere5 = new JobBoardScene();
            insertJobSceneHere5.setJobDescription("Insert Job description here 5");
            insertJobSceneHere5.setJobDifficulty(2);
            insertJobSceneHere5.setJobType("Hopfully Awesome Job");
            insertJobSceneHere5.setReward(100);
            insertJobSceneHere5.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.insertJobSceneHere5.ordinal()] = insertJobSceneHere5;
            
            JobBoardScene insertJobSceneHere6 = new JobBoardScene();
            insertJobSceneHere6.setJobDescription("Insert Job description here 6");
            insertJobSceneHere6.setJobDifficulty(3);
            insertJobSceneHere6.setJobType("Hopfully Awesome Job");
            insertJobSceneHere6.setReward(100);
            insertJobSceneHere6.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.insertJobSceneHere6.ordinal()] = insertJobSceneHere6;
            
            JobBoardScene insertJobSceneHere7 = new JobBoardScene();
            insertJobSceneHere7.setJobDescription("Insert Job description here 7");
            insertJobSceneHere7.setJobDifficulty(3);
            insertJobSceneHere7.setJobType("Hopfully Awesome Job");
            insertJobSceneHere7.setReward(100);
            insertJobSceneHere7.setCompleted(false);
            jobBoard[JobBoardSceneControl.Scene.insertJobSceneHere7.ordinal()] = insertJobSceneHere7;
            
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

    private static void brokenquest() {
        GatherSpaceChickens gatherchickens = new GatherSpaceChickens();
        gatherchickens.broken();
    }

    private static void destroyMeteoroidShower(){
        DestroyMeteoroidShower destroyMeteoroidShower = new DestroyMeteoroidShower();
        destroyMeteoroidShower.display();
    }
    
    private static void gatherSpaceChickens() {
        GatherSpaceChickens gatherchickens = new GatherSpaceChickens();
        gatherchickens.display();
    }

    private static void checkOutDistressBeacon() {
        CheckOutDistressBeacon checkOutDistressBeacon = new CheckOutDistressBeacon();
        checkOutDistressBeacon.display();
    }

    private static void smallSettlementInTrouble() {
        SmallSettlementInTrouble smallSettlementInTrouble = new SmallSettlementInTrouble();
        smallSettlementInTrouble.display();
    }

    private static void raidATown() {
      RaidATown raidATown = new RaidATown();
      raidATown.display();
    }
    
    public enum Scene {
        
            gatherSpaceChickens,
            destroyMeteoroidShower,
            checkOutDistressBeacon,
            smallSettlementInTrouble,
            raidATown,
            insertJobSceneHere5,
            insertJobSceneHere6,
            insertJobSceneHere7,
            insertJobSceneHere8,
            insertJobSceneHere9;   
        }
    public static void printJobList(String filePath) throws FileNotFoundException {
        JobBoardScene[] jobBoard = Game.jobBoard;
       
        try(PrintWriter out = new PrintWriter("C:/SpaceGame/joblist." + filePath + ".txt")) {
            
            out.println("\n                                                               Job Board List                       ");
            out.printf("%n%-80s%-20s%15s", " Job Description", " Job Type", " Job Difficulty");
            out.printf("%n%-80s%-20s%15s", "---------------------------------------------------------------", "--------------", "----------------");
            
            for (JobBoardScene jobBoardScene : jobBoard) {
                
                out.printf("%n%-80s%-10s%15s", jobBoardScene.getJobDescription(), jobBoardScene.getJobType(), jobBoardScene.getJobDifficulty());
                out.printf("%n%-80s"," ");
            }
                
        } catch(Exception e) {
            ErrorView.display("Job List Didn't print", e.getMessage());
        }
      
      }
}

