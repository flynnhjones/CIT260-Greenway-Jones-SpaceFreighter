/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.JobBoardSceneControl;


/**
 *
 * @author jaxom
 */
class NonBattleView extends SuperView {
  
    public NonBattleView() {
        super("\n"
                + "\n"
                + "*----------------------------------*"
                + "\n|     Choose your difficulty to    |"
                 +"\n|      view available Jobs         |"
                + "\n|----------------------------------|"
                +"\n| E - Easy Job                      |"
                +"\n| M - Medium Job                   |"
                +"\n| H - Hard Job                     |"
                +"\n| S - Super Hard Job               |"
                +"\n| Q – Quit to Ship menu            |"
                +"\n*----------------------------------*");
    }
                                             
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    


}
