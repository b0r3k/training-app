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
        this.allCoaches = new ArrayList<>();
        this.allNutritionists = new ArrayList<>();
    }
    
    public ArrayList<Coach> getAllCoaches(){
        return this.allCoaches;
    }
    
    public ArrayList<Nutritionist> getAllNutritionists(){
        return this.allNutritionists;
    }
    
    public ArrayList<User> getAllUsers(){
        return this.allUsers;
    }
    
    public String[] ViewUsersNames(){
        int numberUsers = this.allUsers.size();
        String[] usersNames = new String[numberUsers];
        for (int i=0; i<numberUsers; i++){
            usersNames[i] = this.allUsers.get(i).getName();
        }
        return usersNames;
    }
    
    public String[] ViewCoachesNamesExpertise(){
        int numberCoaches = this.allCoaches.size();
        String[] coachesNamesExpertise = new String[numberCoaches];
        for (int i=0; i<numberCoaches; i++){
            Coach coach = this.allCoaches.get(i);
            String name = coach.getName();
            String expertise = coach.getExpertise();
            coachesNamesExpertise[i] = name + ": " + expertise;
        }
        return coachesNamesExpertise;
    }
    
    public String[] ViewNutrsNamesExpertise(){
        int numberNutrs = this.allNutritionists.size();
        String[] nutrsNamesExpertise = new String[numberNutrs];
        for (int i=0; i<numberNutrs; i++){
            Nutritionist nutr = this.allNutritionists.get(i);
            String name = nutr.getName();
            String expertise = nutr.getExpertise();
            nutrsNamesExpertise[i] = name + ": " + expertise;
        }
        return nutrsNamesExpertise;
    }
    
    public void AddCoach(Coach c){
        this.allCoaches.add(c);
        this.allUsers.add(c);
    }
    
    public void AddNutritionist(Nutritionist n){
        this.allNutritionists.add(n);
        this.allUsers.add(n);
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
