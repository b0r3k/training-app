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
        Athlete a2 = new Athlete("Karel", "pass", "karel@karel.cz", 80, 180, 2002, "No.");
        a2.AddSportDay(new SportDay(1,1,2021));
        app.AddAthlete(a2);
        
        SportDay s1 = new SportDay(1,2,2024);
        SportDay s2 = new SportDay(1,3,2024);
        SportDay s3 = new SportDay(1,2,2025);
        Exercise e1 = new Exercise("Hola", 5 , BasedOn.REPS);
        Exercise e2 = new Exercise("Holafd", 5 , BasedOn.REPS);
        Exercise e3 = new Exercise("Holajsajf", 5 , BasedOn.REPS);
        s1.AddExcer(e1);
        s1.AddExcer(e2);
        s1.AddExcer(e3);
        
        s2.AddExcer(e1);
        s2.AddExcer(e2);
        s3.AddExcer(e3);
                
               
        
        Food f1 = new Food("manza", 2, "lkjsdfsdf");
        Food f2 = new Food("manzann", 2, "lkjsdfsdf");
        Food f3 = new Food("manzanita", 2, "lkjsdfsdf");
        
        s1.AddFood(f1);
        s1.AddFood(f2);
        s1.AddFood(f3);
        
        s2.AddFood(f1);
        s2.AddFood(f2);
        s3.AddFood(f3);
        
        a.AddSportDay(s3);
        a.AddSportDay(s2);
        a.AddSportDay(s1);
        Coach c = new Coach("Pepa", "pass", "pepa@pepa.cz", "Swimming.");
        c.AddAthleteToGroup(a);
        c.AddAthleteToGroup(a2);
        app.AddCoach(c);
        Nutritionist n = new Nutritionist("Venca", "pass", "venca@venca.cz", "Cycling.");
        n.AddAthleteToGroup(a);
        n.AddAthleteToGroup(a2);
        app.AddNutritionist(n);
        
        EntryForm gui = new EntryForm(app);
        gui.setVisible(true);
    }
    
    public static void GoHome(App m){
        EntryForm gui = new EntryForm(m);
        gui.setVisible(true);
    }
    
}
