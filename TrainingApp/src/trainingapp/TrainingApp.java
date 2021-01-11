/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingapp;

import model.*;
import gui.*;
/**
 *
 * @author borek
 */
public class TrainingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App app = new App();
        
        User u = new Athlete(40, 160, 23, 2, 1994, "Can't walk.");
        app.AddUser(u);
        u = new Athlete(80, 180, 2, 2, 2002, "No.");
        app.AddUser(u);
        
        EntryForm gui = new EntryForm(app);
        gui.setVisible(true);
    }
    
}
