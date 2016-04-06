/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view.jobs;

import byui.cit260.spacefreighter.control.JobBoardSceneControl;
import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.JobBoardScene;
import byui.cit260.spacefreighter.view.SuperView;

/**
 *
 * @author jaxom
 */
public class RaidATown extends SuperView {

    public RaidATown() {
        
        super("    An unknown party has listed a job that is very daring if your "
                + "\n up for the task. A spacetown named Gothem it being ran by a "
                + "\n Mobster by the name of Batman. You must infiltrate his base"
                + "\n and take all you can to stop their illigal activity."
                + "\n-----------------------------------------------------------------"   
                + "\n               *****What will you do?*****"
                + "\n               | T - Take the job        |"
                + "\n               | D - Don't take the job  |"
                + "\n               ***************************"
                + "\n                   Make your choice!");
        
    }

    @Override
    public boolean doAction(String value) {
       value = value.toUpperCase();
        
        switch (value) {
            case "T":
                this.takeJob();
                break;
            case "D":
                this.dontTakeJob();
                break;           
            default:
                CheckOutDistressBeacon.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }

    private void takeJob() {
        JobBoardScene[] jobBoard = Game.jobBoard;
        if (jobBoard[JobBoardSceneControl.Scene.raidATown.ordinal()].isCompleted()==true) {
            CheckOutDistressBeacon.console.println("You already completed this quest! Try a different one! (Press Q to quit)");
            return;
        }
        
        RaidATown.console.println("    You complete the Raid but all your crew members die, with you barely making it out alive.");
        
        
        JobBoardSceneControl.completeQuest(JobBoardSceneControl.Scene.raidATown.ordinal());
    }

    private void dontTakeJob() {
        CheckOutDistressBeacon.console.println("You decide not to take the job.");
    }
}
