/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import java.util.Scanner;

/**
 *
 * @author jaxom
 */
public class HelpMenuView {
    
    private String menu;
    
    public HelpMenuView() {
        this.menu = "\n"
                + "\n-----------------------------"
                + "\n Help Menu                   |"
                + "\n-----------------------------"
                +"\nG - What is the goal of the game?"
                +"\nM - How to move"
                +"\nC – Captain and Crew character classes/roles"
                +"\nI – How to make money/Jobs board"
                +"\nD – Ship details/launch and travel"
                +"\nR - Shops, Upgrades and Repairs"
                +"\nQ – Quit to main menu"
                +"\n------------------------------";
    }
    
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.goalOfGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "C":
                this.classesRoles();
                break;
            case "I":
                this.howToMakeMoney();
                break;
            case "D":
                this.shipLaunchTravel();
                break;
            case "R":
                this.shopsUpgradesRepairs();
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

    private void goalOfGame() {
        System.out.println("We did it again");
    }

    private void howToMove() {
        System.out.println("We did it again");
    }

    private void classesRoles() {
        System.out.println("We did it again");
    }

    private void howToMakeMoney() {
        System.out.println("We did it again");
    }

    private void shipLaunchTravel() {
        System.out.println("We did it again");
    }

    private void shopsUpgradesRepairs() {
        System.out.println("We did it again");
    }
}
