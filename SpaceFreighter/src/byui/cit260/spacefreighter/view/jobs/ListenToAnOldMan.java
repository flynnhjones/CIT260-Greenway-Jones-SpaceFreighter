/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view.jobs;

import byui.cit260.spacefreighter.control.CurrencyControl;
import byui.cit260.spacefreighter.control.JobBoardSceneControl;
import byui.cit260.spacefreighter.control.TrainingRoomControl;
import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.JobBoardScene;
import byui.cit260.spacefreighter.view.SuperView;

/**
 *
 * @author Daddy
 */
public class ListenToAnOldMan extends SuperView{
    
    public ListenToAnOldMan() {
        super("The local teachers institute is always looking for subjects to listen to their studends teach"
                + " to help them get going with live audience members. Sometimes you can get a good practice instructor,"
                + " but normally their either too nervous or too boring to get anything good (They're always old men). At least the university pays you for this."
                + "\n10% chance to fail, 80% chance to earn 100 space bucks, 10% to earn space bucks and gain a job point! Can do this job multiple times."
                + "\n-----------------------------------------------------------------"   
                + "\n               ******Give it a shot?******"
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
                this.giveAListen();
                break;
            case "D":
                this.tooBoring();
                break;           
            default:
                CheckOutDistressBeacon.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }

    private void giveAListen() {
        int chances = (int) (Math.random() * 10 + 1);
        if (chances == 1) {
            this.youFailed();
        } else if (chances <10) {
            this.gotCash();
        } else {
            this.goodExperience();
        }
    }

    private void tooBoring() {
        this.console.println("Yeah it's a waste of time. Lets get an actual job where we DO something.");
    }

    private void youFailed() {
        this.console.println("Immediately when your practice instructor starts talking you doze off, as though he was using a sleep ray."
                + "When you wake up everybody else has left already, and the university board member looks at you. Sorry, you have to be awake "
                + "to give an accurate review of our student. No pay for you!"
                + "\n***Job failed. You may try again if you like. ***");
    }

    private void gotCash() {
        this.console.println("Well it was an OK lecture... sort of. At least he tried to speak. He was so nervous though that nothing really made sense."
                + "At least you get paid for being here!");
        JobBoardSceneControl.completeQuest(JobBoardSceneControl.Scene.listenToAnOldMan.ordinal());
        JobBoardScene[] jobBoard = Game.jobBoard;
        jobBoard[JobBoardSceneControl.Scene.listenToAnOldMan.ordinal()].setCompleted(false);
    }

    private void goodExperience() {
        this.console.println("What a class! What knowledge! This old man has wisdom beyond his years which is saying something, because he has been around a LOT of years."
                + "\nYou earned 100 space bucks and 1 job point!");
        CurrencyControl.addCurrency(100);
        TrainingRoomControl.addUnusedSkillPoint(1);
    }
    
}
