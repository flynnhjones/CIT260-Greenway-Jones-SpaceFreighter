/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import java.io.PrintWriter;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author jaxom
 */
public class DisplayBannerView extends SuperView{

    public DisplayBannerView() {
        
       super(
            "\n*****************************------WELCOME!------********************************"
            +"\n*                                                                               *"
            +"\n*       In this game you will be playing a captain of your own ship. You have   *"
            +"\n*   come into possession of a spaceship, or most of a ship, and it will be!     *"
            +"\n*   Once you have acquired the parts and pieces.                                *"
            +"\n*       You will first be seeking jobs on the current planet to earn some       *"
            +"\n*   parts or currency, to pay for the necessary parts, to get your ship at      *"
            +"\n*   least flight worthy.                                                        *"
            +"\n*       You will be able to hone your ship and crew skills in areas of your     *"
            +"\n*   choosing.                                                                   *"
            +"\n*       Your first goal is to get your space ship flight worthy. The next, is   *"
            +"\n*   to build your currency to a set amount to be able to retire very wealthy.   *"
            +"\n*                                                                               *"
            +"\n*                     Press S to go to The Main Menu                            *"
            +"\n*********************************************************************************"
        );
    
    }
@Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {

            case "S":
                this.mainMenuView();
                break;           
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }

    private void mainMenuView() {
         MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}