/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingapp;

import java.util.ArrayList;
import model.Coach;
import model.Nutritionist;

/**
 *
 * @author borek
 */
public class TrainingApp {
    
    private static ArrayList<Coach> allCoaches;
    private static ArrayList<Nutritionist> allNutritionists;
    
    public static ArrayList<Coach> ViewCoaches(){
        return allCoaches;
    }
    
    public static ArrayList<Nutritionist> ViewNutritionists(){
        return allNutritionists;
    }
    
    public static void AddCoach(Coach c){
        allCoaches.add(c);
    }
    
    public static void AddNutritionist(Nutritionist n){
        allNutritionists.add(n);
    }

}
