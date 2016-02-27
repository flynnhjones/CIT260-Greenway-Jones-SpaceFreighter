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
        System.out.println("The Goal of the game is to earn enough currency to retire very rich!");
    }

    private void howToMove() {
        System.out.println("Have not decided this yet!");
    }

    private void classesRoles() {
        System.out.println("\nThere are four main class Roles that you can put skill points in."
                            +"\nAdding points to the pilot skill decreases the amount you have to spend to refuel the ship."
                            +"\nAdding points to the Mechanic skill decreases the amount you have to spend to repair the ship."
                            +"\nAdding points to the Merchant skill decreases the cost of shop items and increases the sell price of items you have."
                            +"\nAdding points to the Weapons Specialist Skill increases the amount of currency from jobs."
                               );
    }

    private void howToMakeMoney() {
        System.out.println("You make money by completeing jobs from the job board.");
    }

    private void shipLaunchTravel() {
        System.out.println("You launch the ship to the destination of your choosing, dependant on amount of fuel you have.");
    }

    private void shopsUpgradesRepairs() {
        System.out.println("You can buy and sell items you need or gain from jobs. You also will need to repair, maintain and refuel your ship as you travel from place to place");
    }
}
