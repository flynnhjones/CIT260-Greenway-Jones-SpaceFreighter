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
class FightView {
    
    private String menu;
    
    public FightView() {
        this.menu = "\n"
                + "\n-----------------------------"
                + "\n What will you do?           |"
                + "\n-----------------------------"
                +"\nF - Attack"
                +"\nI – Item" 
                +"\nS - Use Skill"
                +"\nQ - Go back"
                +"\n------------------------------";
    }
    
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "F":
                this.attack();
                break;
            case "N":
                this.item();
                break;         
            case "S":
                this.skill();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    public void displayFightView() {
        
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

    private void attack() {
        AttackView dodamage = new AttackView();
        dodamage.attack();
    }

    private void item() {
        System.out.println("You can use items!");
    }

    private void skill() {
        System.out.println("You can use skills!");
    }
    
}
