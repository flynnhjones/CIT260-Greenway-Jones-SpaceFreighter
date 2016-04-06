/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view.jobs;

import byui.cit260.spacefreighter.control.CurrencyControl;
import byui.cit260.spacefreighter.control.JobBoardSceneControl;
import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.JobBoardScene;
import byui.cit260.spacefreighter.view.SuperView;

/**
 *
 * @author Daddy
 */
public class GatherSpaceChickens extends SuperView{

   public GatherSpaceChickens() {  
       
       super("\n Old Madam Granger:"
            + "\nThank you so much for taking my job! I can't tell you how badly I've needed this to be done. I just need some dang chickens, but everybody says it's beneath them!"
            + "\nI'm just an old woman who has a broken hip and I can't get around well. My husband would normally fetch me some but he died a while back."
            + "\nPlease please head over to the farmland quadrant and bring me 10 chickens. Thank you so much!"
            + "\n\n What will you do?"
            + "\nG - Get her the stupid chickens (even though it's not worth your time)"
            + "\nD - Don't bother. You've got waaaaay better things to do!"
            + "\nMake your choice");    
}
   
   @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "G":
                this.getChickens();
                break;
            case "D":
                this.dontGetChickens();
                break;           
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }    

    private void getChickens() {
        
        JobBoardScene[] jobBoard = Game.jobBoard;
        if (jobBoard[JobBoardSceneControl.Scene.gatherSpaceChickens.ordinal()].isCompleted()==true) {
            this.console.println("You already completed this quest! Try a different one! (Press Q to quit)");
            return;
        }
        
        this.console.println("Easy job! This is a good opportunity for some easy cash. You do as asked."
                + "\nWhen you let Space Farmer Bob know who the chickens are for, he obliges."
                + "\n'Oh for Madam Granger? You doin' this for her now? You replacin' her husband or sumthin'?'"
                + "\nYou feel strange about the question, but explain she's paying you for this."
                + "\n'Oh well you never mind about paying for these, she's got set up on a right reg'lar schedule. Here's the goods"
                + "\nFarmer Bob hands you the space chickens, and bids you a good day. You are more than happy to leave that weirdo."
                + "\nMadam Granger left a note with your payment enclosed on her porce saying you can just leave the chickens in her little barn."
                + "\nIt wasn't much trouble to put them in. Knock that one off the job list! Maybe she will need more later?");
        
        
        JobBoardSceneControl.completeQuest(JobBoardSceneControl.Scene.gatherSpaceChickens.ordinal());
    }

    private void dontGetChickens() {
        this.console.println("You decide getting chickens for some old coot totally isn't worth your time. Better go find a REAL job.");
        
    }

    public void broken() {
        this.console.println("This is one broken quest!");
    }
    
    
    
}
