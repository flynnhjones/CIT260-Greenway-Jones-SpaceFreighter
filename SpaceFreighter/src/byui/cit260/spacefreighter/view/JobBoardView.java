/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.model.JobBoardScene;
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
                +"\nB - Battle Job"
                +"\nN – Non-Battle Job" 
                +"\nQ - Go back"
                +"\n------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "B":
                this.battleJob();
                break;
            case "N":
                this.nonBattleJob();
                break;            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    private void battleJob() {
        BattleMenuView battleMenu = new BattleMenuView();
        battleMenu.display();
    }

    private void nonBattleJob() {
        NonBattleView nonBattleMenu = new NonBattleView();
        nonBattleMenu.display();
    }
 
}
