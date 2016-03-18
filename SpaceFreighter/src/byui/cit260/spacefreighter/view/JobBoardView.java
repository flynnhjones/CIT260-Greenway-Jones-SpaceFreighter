/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.JobBoardScene;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Daddy
 */
public class JobBoardView extends SuperView {
    
        
    public JobBoardView() {
        super("\n"
                + "\n-----------------------------"
                + "\n Job Board                   |"
                + "\n-----------------------------"
                +"\nJ - Show Job List"                 
                +"\nQ - Go back"
                +"\n------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "J":
                this.displayJobList();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayJobList() {
        System.out.println("\nMake Your Selection");
        String out = "";
        JobBoardScene[] jobBoard = Game.getJobBoard();
        for (int i = 0; i < jobBoard.length; i++) {
            out = out + jobBoard[i].getJobDescription();
        }
        System.out.println(out);
    }
    
   
}
