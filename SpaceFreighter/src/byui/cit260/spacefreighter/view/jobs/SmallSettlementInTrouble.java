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
import static spacefreighter.SpaceFreighter.player;

/**
 *
 * @author jaxom
 */
public class SmallSettlementInTrouble extends SuperView {

    public SmallSettlementInTrouble() {
        
        super("Arriving at the small settlement you are greeted by a small crowd"
            + "\n with the Mayor of the small settlement waving his arm enthusiastically. "
            + "\n Running up to meet you the Mayor tells you his name is Mayor Frank. "
            + "\n After greeting are exchanged Mayor Frank explains that their settlement"
            + "\n has been plagued a number of times by some space pirates. He asks "
            + "\n if we would be willing to go round up the hooligans and transport"
            + "\n them off world to a prison to await justice."
                + "\n A bounty reward will be waiting upon delivery"
            + "\n-------------------------------------------------------------------------"   
            + "\n*****What will you do?*****"
            + "\n| T - Take the job        |"
            + "\n| D - Don't take the job  |"
            + "\n***************************"
            + "\n  Make your choice");
        
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
                SmallSettlementInTrouble.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }

    private void takeJob() {
        JobBoardScene[] jobBoard = Game.jobBoard;
        if (jobBoard[JobBoardSceneControl.Scene.smallSettlementInTrouble.ordinal()].isCompleted()==true) {
            CheckOutDistressBeacon.console.println("You already completed this quest! Try a different one! (Press Q to quit)");
            return;
        }
        
        SmallSettlementInTrouble.console.println("You complete the task and get rewarded! Nice Job!");
        
        
        JobBoardSceneControl.completeQuest(JobBoardSceneControl.Scene.smallSettlementInTrouble.ordinal());
    }

    private void dontTakeJob() {
        SmallSettlementInTrouble.console.println("You decide not to take the job.");
    }
}
