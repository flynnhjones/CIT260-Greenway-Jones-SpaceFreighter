/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefreighter;

import byui.cit260.spacefreighter.model.Game;
import byui.cit260.spacefreighter.model.Player;
import byui.cit260.spacefreighter.view.StartProgramView;
import cit.byui.cit260.spacefreighter.exceptions.GameControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Benjamin/Flynn
 */
public class SpaceFreighter {
    
    public static Game currentGame = null;
    public static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        SpaceFreighter.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        SpaceFreighter.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        SpaceFreighter.inFile = inFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SpaceFreighter.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SpaceFreighter.player = player;
    }

    /**
     * @param args the command line arguments
     * @throws cit.byui.cit260.spacefreighter.exceptions.GameControlException
     */
    public static void main(String[] args) throws GameControlException {
                
        // create StartProgramViewOrig and display the start program view
        
        try {
            SpaceFreighter.inFile = new BufferedReader(new InputStreamReader(System.in));
            
            SpaceFreighter.outFile = new PrintWriter(System.out, true);
            
            String filePath = "C:/SpaceGame/log.txt";
            SpaceFreighter.logFile = new PrintWriter(filePath);
            
        StartProgramView startProgramView = new StartProgramView();    
        startProgramView.displayStartProgramView();
        startProgramView.displayStartProgramView();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            
        }
        finally {
            try {
                if (SpaceFreighter.inFile != null)              
                    SpaceFreighter.inFile.close();
                
                if (SpaceFreighter.outFile != null)
                    SpaceFreighter.outFile.close();
                
                if(SpaceFreighter.logFile != null)
                    SpaceFreighter.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
    }
    
}
