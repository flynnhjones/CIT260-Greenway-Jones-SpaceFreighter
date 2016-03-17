/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spacefreighter.view;

import byui.cit260.spacefreighter.control.JobBoardSceneControl;
import static byui.cit260.spacefreighter.control.JobBoardSceneControl.jobBoardScenes;
import byui.cit260.spacefreighter.model.JobBoardScene;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.ArrayList;


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
            case "E":
                this.getEasyJobList();
                break;
            case "M":
                this.getMediumJobList();
                break;
            case "H":
                this.getHardJobList();
                break;
            case "S":
                this.getSuperHardJobList();
                break;            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    

void getEasyJobList(){
     for (int i = 0; i < JobBoardSceneControl.jobBoardScenes().size(); i++) {
            System.out.println(JobBoardSceneControl.jobBoardScenes().get(i));
        }}

void getMediumJobList(){
 for (int i = 0; i < JobBoardSceneControl.jobBoardScenes().size(); i++) {
            System.out.println(JobBoardSceneControl.jobBoardScenes().get(i));
        }}

void getHardJobList(){
    for (int i = 0; i < JobBoardSceneControl.jobBoardScenes().size(); i++) {
            System.out.println(JobBoardSceneControl.jobBoardScenes().get(i));
        }  
}

void getSuperHardJobList(){
       for (int i = 0; i < JobBoardSceneControl.jobBoardScenes().size(); i++) {
            System.out.println(JobBoardSceneControl.jobBoardScenes().get(i));
        }
}
}
