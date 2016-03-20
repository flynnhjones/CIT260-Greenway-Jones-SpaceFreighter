/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.JobBoardScene;

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
                +"\nB - Battle Jobs               |"
                + "\nN - Non Battle Jobs          |"                 
                +"\nQ - Go back"
                +"\n------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "B":
                this.doBattle();
                break;
            case "N":
                this.displayJobList();
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

    private void doBattle() {
        BattleMenuView battleMenu = new BattleMenuView();
        battleMenu.display();
    }
    
   
}
