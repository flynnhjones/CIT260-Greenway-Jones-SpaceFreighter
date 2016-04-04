/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

/**
 *
 * @author jaxom
 */
public class UpgradeTheShipView extends SuperView{

public UpgradeTheShipView() {
        super("\n"
                + "\n"
                + "*--------------------------------------*"
                + "\n|          Upgrade Ship Menu           |"
                + "\n|--------------------------------------|"
                +"\n| E - Upgrade Engine Componenet        |"
                +"\n| H – Upgrade Ship Haul                |"
                +"\n| G – Upgrade Main Gun                 |"
                +"\n| Q – Quit to Training Room menu       |"
                +"\n*--------------------------------------*");
    }

    @Override
    public boolean doAction(String choice) {
      
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "E":
                this.upgradeEngineComponent();
                break;
            case "H":
                this.upgradeShipHual();
                break;
            case "G":
                this.upgradeMainGun();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void upgradeEngineComponent() {
        this.console.println("You upgraded the Engine!");
    }

    private void upgradeShipHual() {
        this.console.println("You upgraded the hual!");
    }

    private void upgradeMainGun() {
        this.console.println("You upgraded the gun!");
    }
}