/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.GameControl;
import byui.cit260.spacefreighter.control.ItemControl;
import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.InventoryItem;
import byui.cit260.spacefreighter.model.Location;
import byui.cit260.spacefreighter.model.Map;

/**
 *
 * @author jaxom
 */
public class GameMenuView extends SuperView {
    
    
    
    public GameMenuView() {
        super("\n"
                + "\n-----------------------------"
                + "\n Game Menu                   |"
                + "\n-----------------------------"
                +"\nI – Inventory"
                +"\nL – Map/Location chooser"
                +"\nS – Ship menu"
                +"\nX – Shop menu"
                +"\nH – Help menu"
                +"\nZ – Save game"
                +"\nQ – Quit to main menu"
                +"\n------------------------------");        
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "I":
                this.displayInventory();
                break;
            case "L":
                this.displayMap(Game.map);
                break;
            case "S":
                this.shipMenu();
                break;
            case "X":
                this.shopMenu();
                break;
            case "H":
                this.helpMenu();
                break;
            case "Z":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
}

    private void displayInventory() {
      InventoryItem[] inventory = ItemControl.getSortedInventoryList();
      
      System.out.println("\nList of Inventory Items");
      System.out.println("Description" + "\t" + "In Stock");
      
      for(InventoryItem inventoryItem : inventory) {
          System.out.println(inventoryItem.getItemName() + "\t   " + inventoryItem.getQuantity());
      }
    }

    public void displayMap(Map maps) {
      
      Location[][] locations = maps.getLocations();
      int noOfRows = locations.length;
      int noOfColumns = locations[0].length;
      String map = " ";
      
      System.out.println("\nLocation on map.");
      for (int row = 0; row < noOfRows; row++) {
      map = map + (" | " + (row + 1));
      }
      
      for (int row = 0; row < noOfRows; row++) {
          map = map + "\n" + (row + 1);
            for(int column = 0; column < noOfColumns; column++) {
                map = map + " |";
                        
                        boolean visited = locations[row][column].visited;
                        if(visited == true) {
                            map = map + locations[row][column].scene.mapSymbol;
                        }
                        else {
                            map = map + "??";                           
                        }                        
            }
      }
      System.out.println(map);
      
    }

    private void shipMenu() {
       ShipMenuView shipMenu = new ShipMenuView();
        shipMenu.display();
    }

    private void shopMenu() {
        System.out.println("Shop Menu call works - BUT NOT YET DESIGNED");
    }

    private void helpMenu() {
      HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.display();  
    }

    private void saveGame() {
       System.out.println("Save Game Menu call works - BUT NOT YET DESIGNED");
    }
}
