/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

/**
 *
 * @author Daddy
 */
public class ShopView extends SuperView {
    
    public ShopView() {
        super("\n"
                + "\n"
                + "*----------------------------------*"
                + "\n|  What would you like to buy?     |"
                + "\n|----------------------------------|"
                +"\n| W - Weapons                      |"
                +"\n| I - Items                        |"
                +"\n| M – Materials                    |"                
                +"\n| Q – Go back                      |"
                +"\n*----------------------------------*");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "W":
                this.weaponsListMenu();
                break;
            case "I":
                this.itemsListMenu();
                break;
            case "M":
                this.materialsListMenu();
                break;                        
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void weaponsListMenu() {
        System.out.println("This is a weapon list for sale!");
    }

    private void itemsListMenu() {
        System.out.println("This is an item list for sale!");
    }

    private void materialsListMenu() {
        System.out.println("This is a materials list for sale!");
    }
    
    
}
