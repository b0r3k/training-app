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
public class Coach extends SportAdvisor {
    private ArrayList<Exercise> myExercises;
    
    public Coach(String name, String password, String email, String expertise){
        this.setName(name);
        this.setPassword(password);
        this.setEmail(email);
        this.setExpertise(expertise);
        this.groupAthletes = new ArrayList<>();
        this.pendingRequests = new ArrayList<>();
        this.myExercises = new ArrayList<>();
    }
    
    public void AddExercise(Exercise exercise){
        this.myExercises.add(exercise);
    }
    
    public  ArrayList<Exercise> getMyExercises(){
        return this.myExercises;
    }
    public String[] ViewExercises(){
        int numberExercises = this.myExercises.size();
        String[] viewExercises = new String[numberExercises];
        for (int i=0; i<numberExercises; i++){
            Exercise ex = myExercises.get(i);
            String exName = ex.getName();
            String exLength = Integer.toString(ex.getLength());
            String exBasedOn = ex.getBasedOn().toString();
            viewExercises[i] = exName + ", " + exLength + " " + exBasedOn;
        }
        return viewExercises;
    }
}
