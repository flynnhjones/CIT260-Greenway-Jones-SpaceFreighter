/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view.jobs;

import byui.cit260.spacefreighter.control.JobBoardSceneControl;
import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.SpaceShip;
import byui.cit260.spacefreighter.view.ErrorView;
import byui.cit260.spacefreighter.view.SuperView;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daddy
 */
public class DoCoolStunts extends SuperView{
    
    public DoCoolStunts() {
        super("Time for the annual separation from earth day celebrations! Looks like they want you to perform in the air show with your space ship."
                + "This will be a good chance to show off your flight maneuvering skills!"
                + "\n-----------------------------------------------------------------"   
                + "\n               ******Give it a shot?******"
                + "\n               | T - Take the job        |"
                + "\n               | D - Don't take the job  |"
                + "\n               ***************************"
                + "\n                   Make your choice!");
    }
    
    private static int performanceCounter;

    @Override
    public boolean doAction(String value) {
       value = value.toUpperCase();
        
        switch (value) {
            case "T":
       {
           try {
               this.flyAround();
           } catch (IOException ex) {
               ErrorView.display("Do Cool Stunts Job", ex.getMessage());
           }
       }
                break;
            case "D":
                this.iMissEarth();
                break;           
            default:
                CheckOutDistressBeacon.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }

    private void flyAround() throws IOException {
        this.console.println("Dude. Awesome. Totes up to fly like that anyday. Let's get this started. What moves should we do first?"
                + "\n-----------------------------------------------------------------"   
                + "\n               **What moves will you do?**"
                + "\n               | B - Barrel Roll         |"
                + "\n               | L - Loop de loop        |"
                + "\n               | M - Mystical Flight     |"
                + "\n               | C - Crash the ship      |"
                + "\n               | P - Perfect Landing     |"
                + "\n               ***************************"
                + "\n                   Make your choice!");
        
        String choice = this.keyboard.readLine();
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "B":
                this.barrelRoll();
                break;
            case "L":
                this.loop();
                break;
            case "M":
                this.mystical();
                break;
            case "C":
                this.crash();
                break;
            case "P":
                this.perfectLanding();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                this.flyAround();
                break;
        }
        
    }

    private void iMissEarth() {
        this.console.println("SEPARATION from Earth celebration? You shed a tear as you reminisce about how cool Earth was as you turn down the job.");
    }

    private void barrelRoll() throws IOException {
        this.console.println("You do the best barrel roll you have ever done. You're on camera after all!");
        this.tricksdone();
    }

    private void loop() throws IOException {
        this.console.println("Your loop de loop was superb! This one's for you Little Timmy!");
        this.tricksdone();
    }

    private void mystical() throws IOException {
        this.console.println("Your flight patterns would mystify most magicians. Which is interesting, since all you did was a figure eight.");
        this.tricksdone();
    }

    private void crash() {
        this.console.println("YOU CRASHED YOUR SHIP! WHY DID YOU DO THAT? There had to be a better trick! The audience is unimpressed and goes home sad."
                + "Your ship lost all its durability and fuel as well."
                + "\n***Job failed. You may try again if you like. ***");
        SpaceShip ship = Game.getSpaceShip();
        ship.durability = 0;
        ship.fuelGauge = 0;
    }

    private void perfectLanding() throws IOException {
        if (this.performanceCounter > 2) {
            this.console.println("You come in for a perfect landing, wowing everybody. As you step out of your ship you hear a deafening cheer from the crowd."
                    + "As you step down they throw flowers and money at you. What a good day to be separated from Earth!");
            JobBoardSceneControl.completeQuest(JobBoardSceneControl.Scene.doCoolStunts.ordinal());
        } else {
            this.console.println("Don't stop yet. You need to win the crowd!");
            this.flyAround();
        }
    }

    private void tricksdone() throws IOException {
        this.performanceCounter = this.performanceCounter + 1;
        if (this.performanceCounter > 2) {
            this.console.println("That should be it! Let's bring it in for a perfect landing!");
            this.flyAround();
        }
        else {
            this.console.println("Pretty good! Just a few more tricks and I will win their hearts... and their cash!");
            this.flyAround();
        }
    }
    
}
