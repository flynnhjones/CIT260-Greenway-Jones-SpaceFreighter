/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view.jobs;

import byui.cit260.spacefreighter.control.JobBoardSceneControl;
import byui.cit260.spacefreighter.control.SpaceShipControl;
import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.JobBoardScene;
import byui.cit260.spacefreighter.view.ErrorView;
import byui.cit260.spacefreighter.view.SuperView;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daddy
 */
public class WhereAreMyGlasses extends SuperView{
    
    public WhereAreMyGlasses() {
    
    super("     After accepting the job in the computer, you immediately receive a call"
            + "\n'Hello? Hello? You took my job?"
            + "\nYou start to respond but are immediately cut off"
            + "\n'Hello? Speak up sonny! I can't hear you with all that damn racket you got going on!"
            + "\nAnywho, thanks for taking this job, it means a lot to me! My glasses are missing, and I just"
            + "can't find 'em anywhere! I last saw them when I was foraging for rabbits in the megaswamp of"
            + "the planet Kralno. No idea where I dropped them, but they're green!"
            + "\nWill you search for the old man's glasses? The swamp is pretty gross..."
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
       {
           try {
               this.startJob();
           } catch (IOException ex) {
               ErrorView.display("Find Glasses Job", ex.getMessage());
           }
       }
                break;
            case "D":
                this.noWay();
                break;           
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                this.display();
                break;
        }
        return true;
    }

    private void startJob() throws IOException {
        
        JobBoardScene[] jobBoard = Game.jobBoard;
        if (jobBoard[JobBoardSceneControl.Scene.whereAreMyGlasses.ordinal()].isCompleted()==true) {
            this.console.println("You already completed this quest! Try a different one! (Press Q to quit)");
            return;
        }
        this.console.println("You decide to go into the super gross swamp of Kralno. The mind-boggling stench fills "
                + "your nostrils as your ship enters the atmosphere, and immediately you try to hurl your wonderful swamp rabbit sandwich. Good thing you were also doing your laundry! "
                + "You take a clothespin to your nose and dive into the swamp."
                + "\n After a bit of searching you notice three bits of shiny materials in the distance, but you only have enough time to examine one before "
                + "your clothespin disintegrates from the bacteria in the air. Apparently they love eating clothespins, but humans are safe! Except the smell that is."
                
                + "\n               ******Where will you search?*****"
                + "\n               | T - In that weird tree        |"
                + "\n               | B - With the pile of bunnies  |"
                + "\n               | R - Rocky cavern              |"
                + "\n               *********************************"
                + "\n                   Make your choice!");
        
        String choice = this.keyboard.readLine();
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "T":
                this.searchTree();
                break;
            case "B":
                this.searchBunnies();
                break;
            case "R":
                this.searchCavern();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                this.startJob();
                break;
        }
        
        }

    private void searchTree() {
        this.console.println("Nope, this is no pair of glasses. This is a bird. An angry flesh-eating giant bird. Better run!"
                + "\nYou flee the man-eating swamp raven and get back into your ship just in time for your clothespin to expire, and you "
                + "hear the monstrous avian clawing away at the door. Better get out of here! No glasses could be worth this!"
                + "\n***Job failed. You may try again if you like. ***");
        
        SpaceShipControl.removeFuelAndDurability();
    }

    private void searchBunnies() {
        this.console.println("Well, the old man did say he lost the glasses while foraging for rabits. Perhaps one playfully scampered off with them?"
                + "You arrive at the pile of bunnies, to discover that it is a pile of dead bunnies. They look like somebody had trapped them and forgotten them. "
                + "A strange thing, but swamp bunnies are very delicious "
                + "and highly nutritional. You gather the bunnies in your sack, and at the bottom you find a pair of green glasses. Hopefully these are them!"
                + "\n\nYou return the glasses to the old man. They're a little bent, but it turns out that's how he always wears them."
                + "\n'Thank ye, sonny! I don't know what I'd do without ye. Looks like you caught yerself a nice catch, too! Mebbe I can teach you how to make "
                + "a nice rabbit pizza. This new art of culinary cooking creates some extra food... and extra profits!");
        
        JobBoardSceneControl.completeQuest(JobBoardSceneControl.Scene.whereAreMyGlasses.ordinal());
    }

    private void searchCavern() {
        this.console.println("You enter the cavern and though it is dark, you find a small glimmer of light reflecting off a metal surface."
                + "Upon closer inspection, it is indeed a pair of glasses. It's a little dark, so you can't see the color, but come on who finds glasses in a cave?"
                + "\nYou don't have long to ponder this as you hear a deafening roar come from within. Whatever is there doesn't want you to take those glasses!"
                + "You run as fast as your legs will carry you, hop in your car, and start the engine. Looking up you see a raging rhinocerblaster beast charging "
                + "straight at your ship! You get your ship off the ground in time to miss the best by inches. That was a close one!"
                + "\n*****"
                + "\nYou get back to the old man, and hand him the pair of glasses."
                + "\n'BLUE? I said my glasses were green! I wouldn't be caught dead in blue glasses! You young people have no repsect! Why back in my day..."
                + "\nYou know where this is going. Better leave while he's distracted. Too bad you didn't get paid though."
                + "\n***Job failed. You may try again if you like. ***");
        
        SpaceShipControl.removeFuelAndDurability();
    }
    

    private void noWay() {
        this.console.println("'The super gross swamp of Kralno? No thanks!' You tell the old man."
                + "'Just get a new pair of glasses!' you finish, as you slam the phone down. Some"
                + " people should keep better track of their things, sheesh!");
    }
    
}
