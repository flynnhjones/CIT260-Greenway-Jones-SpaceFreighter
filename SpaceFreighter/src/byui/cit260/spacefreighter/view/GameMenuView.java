/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.GameControl;
import byui.cit260.spacefreighter.control.ItemControl;
import byui.cit260.spacefreighter.control.MapControl;
import byui.cit260.spacefreighter.model.Game;
import static byui.cit260.spacefreighter.model.Game.inventory;
import byui.cit260.spacefreighter.model.InventoryItem;
import byui.cit260.spacefreighter.model.Location;
import byui.cit260.spacefreighter.model.Map;
import cit.byui.cit260.spacefreighter.exceptions.GameControlException;
import spacefreighter.SpaceFreighter;

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
                +"\nL – Display Map Locations"
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
                try{
                this.displayInventory();
                } catch(GameControlException ex) {
                    this.console.println("Error with Inventory");
                }
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
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
}

    private void displayInventory() throws GameControlException {
      
        InventoryItem[] inventory = Game.inventory;
        this.console.println("\nList of Inventory Items");
        this.console.println("Description" + "\t" + "In Stock");
        for(InventoryItem inventoryItem : inventory) {
          this.console.println(inventoryItem.getItemName() + "\t   " + inventoryItem.getQuantity());
      }
    }

    public void displayMap(Map maps) {
      
      Location[][] locations = maps.getLocations();
      int noOfRows = locations.length;
      int noOfColumns = locations[0].length;
      String map = " ";
      
      this.console.println("\nLocation on map.");
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
      this.console.println(map);
      
    }

    private void shipMenu() {
       ShipMenuView shipMenu = new ShipMenuView();
        shipMenu.display();
    }

    private void shopMenu() {
        this.console.println("Shop Menu call works - BUT NOT YET DESIGNED");
    }

    private void helpMenu() {
      HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.display();  
    }

    private void saveGame() {
        this.console.println("Enter name of save file.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(SpaceFreighter.getCurrentGame(), ("C:/SpaceGame/" + filePath + ".txt"));
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        try {
            ItemControl.saveInventory(Game.inventory, filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        try {
            MapControl.saveMap(Game.map, filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        this.console.println("You saved! Good job!");
    }
}
