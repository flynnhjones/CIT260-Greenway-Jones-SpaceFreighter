/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.GameControl;
import byui.cit260.spacefreighter.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import spacefreighter.SpaceFreighter;

/**
 *
 * @author Daddy
 */
class VictoryView {
    private static PrintWriter console = SpaceFreighter.getOutFile();
    private static BufferedReader keyboard = SpaceFreighter.getInFile();

    static void youWin() throws IOException {
        VictoryView.console.println("CONGRATULATIONS! YOU MAY NOW RETIRE AND LIVE YOUR WILDEST DREAMS!"
                + "\nYou can finally go rest on your own and live however you want, with nobody"
                + "\nteling you what to do or how to do it. Do be sure to stop and say thanks"
                + "\nto those who helped you along!"
                + "\n      --------"
                + "\n      | O O  |"
                + "\n      |      | < YAY!"
                + "\n      | <__> |"
                + "\n      |______|");
        
        VictoryView.console.println("Would you like to play again? Y for yes, N for no");
        String answer = VictoryView.keyboard.readLine();
        answer = answer.toUpperCase();
        if ("Y".equals(answer)) {
            Player player = new Player();
            GameControl.creatNewGame(player);
        }
        else {
            VictoryView.console.println("Very well, I hope you had fun! Enjoy your spoils!");
            System.exit(0);
    }
    
}
}
