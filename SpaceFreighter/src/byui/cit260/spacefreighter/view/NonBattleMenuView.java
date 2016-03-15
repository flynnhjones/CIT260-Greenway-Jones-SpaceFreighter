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
public class NonBattleMenuView extends SuperView {
    
    public NonBattleMenuView() {
        super("\n"
                + "\n-----------------------------"
                + "\n Job Board                   |"
                + "\n-----------------------------"
                +"\nChoose your difficulty: "
                +"\n1 -Easy" 
                +"\n2 -Medium"
                +"\n3 -Hard"
                +"\n4 -Super Hard"
                +"\n------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "1":
                this.displayEasyJobs();
                break;
            case "2":
                this.displayMediumJobs();
                break;
            case "3":
                this.displayHardJobs();
                break;  
            case "4":
                this.displaySuperHardJobs();
                break;  
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayEasyJobs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMediumJobs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHardJobs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displaySuperHardJobs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
