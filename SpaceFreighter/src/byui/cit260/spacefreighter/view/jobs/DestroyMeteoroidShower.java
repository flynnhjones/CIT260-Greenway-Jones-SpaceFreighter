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
public class DestroyMeteoroidShower extends SuperView {

    public DestroyMeteoroidShower() {
        
        super("Farmer Brown:"
            + "\n-------------------------------------------------------------------------"
            + "\n Thanks for heading out here so quickly!"
            + "\n   My Radar has detected a meteroid field heading straight this way"
            + "\n towards my space farm. This is going to set me way back!"
            + "\n   I have a ship but it's not built for shooting, just for transporting"
            + "\n my harvested water."
            + "\n   I see your Ship has a nice big Gun on it, It could pulverize the "
            + "\n meteroid field to harmlest dust!"
            + "\n I will pay you greatly for your services!"
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
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }

    private void takeJob() {
        JobBoardScene[] jobBoard = Game.jobBoard;
        if (jobBoard[JobBoardSceneControl.Scene.destroyMeteoroidShower.ordinal()].isCompleted()==true) {
            this.console.println("You already completed this quest! Try a different one! (Press Q to quit)");
            return;
        }
        
        this.console.println("  You take off towards your ship and Farmer Brown calls out, “Good luck"
                + "\n " + player.getPlayerName() + ", the fate of my farm is in "
                + "\n your hands!” "
                + "\n   Entering the ship, you call out to your pilot to man the"
                + "\n controls and take off towards the coordinates given to you"
                + "\n by Farmer Brown. Your pilot calls out to hold on and takes"
                + "\n off towards the meteoroid field. Upon arrival you begin"
                + "\n scanning the field with your 3D scanner. The sound of the"
                + "\n big gun can be heard going off as the ships computer"
                + "\n analyzes the best possible outcome and were to fire to "
                + "\n avoid death and disburse the dust. "
                + "\n   Upon completion you head back to Farmer Brown and receive your pay.");
        
        
        JobBoardSceneControl.completeQuest(JobBoardSceneControl.Scene.destroyMeteoroidShower.ordinal());
    }

    private void dontTakeJob() {
        this.console.println("You decide not to take the job.");
    }
    
     public void broken() {
        this.console.println("This is one broken quest!");
    }
    
    
}
