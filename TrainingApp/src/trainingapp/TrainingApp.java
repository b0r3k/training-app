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
        
        Athlete a = new Athlete("Emil", "pass", "emil@emil.cz", 40, 160, 1994, "Can't walk.");
        app.AddAthlete(a);
        a = new Athlete("Karel", "pass", "karel@karel.cz", 80, 180, 2002, "No.");
        app.AddAthlete(a);
        Coach c = new Coach("Pepa", "pass", "pepa@pepa.cz", "Swimming.");
        app.AddCoach(c);
        Nutritionist n = new Nutritionist("Venca", "pass", "venca@venca.cz", "Cycling.");
        app.AddNutritionist(n);
        
        EntryForm gui = new EntryForm(app);
        gui.setVisible(true);
    }
    
    public static void GoHome(App m){
        EntryForm gui = new EntryForm(m);
        gui.setVisible(true);
    }
    
}
