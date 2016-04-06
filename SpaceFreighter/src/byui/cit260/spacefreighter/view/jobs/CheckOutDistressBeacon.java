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
public class CheckOutDistressBeacon extends SuperView {

    public CheckOutDistressBeacon() {
        
        super("     After arriving at the location of the distress beacon you find a "
                + "\n small freighter ship drifting in space. After hailing the ship, "
                + "\n you are meet with a very distressed captain, Jake, from Space "
                + "\n Farm. He tells you his shipment of khaki pants is going to "
                + "\n be very late unless he can get a new engine delivered and "
                + "\n installed. He asks if you can go pick up the ship engine from "
                + "\n the closest new engine shop, he will reward you famously."
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
        if (jobBoard[JobBoardSceneControl.Scene.checkOutDistressBeacon.ordinal()].isCompleted()==true) {
            CheckOutDistressBeacon.console.println("You already completed this quest! Try a different one! (Press Q to quit)");
            return;
        }
        
        CheckOutDistressBeacon.console.println("    You let Jake, from Space Farm, know that "
                + "\n you will get the new engine for them and be back as soon as"
                + "\n possible before closing the communication. You check for the"
                + "\n closest settlement with a new engine that fits the freighter. "
                + "\n       After what seems like a long time you find the destination"
                + "\n and signal to your pilot to head to that location. You arrive "
                + "\n at the settlement, find the dealer and grab the engine with "
                + "\n the promise that Jake, from Space Farm, will be by to settle "
                + "\n the debt. You return to the distress beacon location where"
                + "\n you shuttle the engine over to Jake, From Space Farm, to install."
                + "\n He wires you the reward.");
        
        
        JobBoardSceneControl.completeQuest(JobBoardSceneControl.Scene.checkOutDistressBeacon.ordinal());
    }

    private void dontTakeJob() {
        CheckOutDistressBeacon.console.println("You decide not to take the job.");
    }
}
