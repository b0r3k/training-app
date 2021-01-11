/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author borek
 */
public class App {
    private ArrayList<User> allUsers;
    private ArrayList<Coach> allCoaches;
    private ArrayList<Nutritionist> allNutritionists;
    
    // Should the stuff be static??

    public App(){
        this.allUsers = new ArrayList<>();
        allCoaches = new ArrayList<>();
        allNutritionists = new ArrayList<>();
    }
    
    public ArrayList<Coach> ViewCoaches(){
        return this.allCoaches;
    }
    
    public ArrayList<Nutritionist> ViewNutritionists(){
        return this.allNutritionists;
    }
    
    public void AddCoach(Coach c){
        this.allCoaches.add(c);
    }
    
    public void AddNutritionist(Nutritionist n){
        this.allNutritionists.add(n);
    }
    
    public void AddAthlete(Athlete a){
        this.allUsers.add(a);
    }
    
    public Boolean NameExists(String name){
        return allUsers.stream().anyMatch(u -> u.getName().equals(name));
    }
    
    public Boolean EmailExists(String email){
        return allUsers.stream().anyMatch(u -> u.getEmail().equals(email));
    }
}
