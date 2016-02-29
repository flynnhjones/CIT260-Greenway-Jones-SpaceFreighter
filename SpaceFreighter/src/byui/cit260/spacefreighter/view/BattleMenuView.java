/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import java.util.Scanner;

/**
 *
 * @author Daddy
 */
public class BattleMenuView {
    private String menu;
    
    public BattleMenuView() {
        this.menu = "\n"
                + "\n-----------------------------"
                + "\n Enemy Appeared!             |"
                + "\n-----------------------------"
                +"\nF - Fight"
                +"\nR – Flee"              
                +"\n------------------------------";
    }
    
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "F":
                this.fightMenu();
                break;
            case "R":
                this.goBackToShip();
                break;            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    public void displayMenu() {
        
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
            
        }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1){
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break;
        }
    
        return value;
}

    private void fightMenu() {
        FightView fight = new FightView();
        fight.displayFightView();
    }

    private void goBackToShip() {
        ShipMenuView shipMenu = new ShipMenuView();
        shipMenu.displayMenu();
    }
}
