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
        
        super();
        
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
        
        SmallSettlementInTrouble.console.println();
        
        
        JobBoardSceneControl.completeQuest(JobBoardSceneControl.Scene.smallSettlementInTrouble.ordinal());
    }

    private void dontTakeJob() {
        SmallSettlementInTrouble.console.println("You decide not to take the job.");
    }
}
