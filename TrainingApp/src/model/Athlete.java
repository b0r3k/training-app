/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author borek
 */
public class Athlete extends User {
    private int weight;         // kilograms
    private int height;         // centimetres
    private float bmi;
    private int age;            // years
    private int birthday;
    private String limitations;
    private ArrayList<SportDay> sportPlan;
    private ArrayList<SportDay> oldSportPlan;
    private Boolean hasCoach;
    private Boolean hasNutritionist;
    
    public Athlete(String name, String password, String email, int w, int h, int bYear, String l){
        if (w < 30 || w > 220 || h < 120 || h > 230 || bYear < 1900 || bYear > LocalDate.now().getYear()){
            // TODO EXCEPTION;
        }
        else{
            this.setName(name);
            this.setPassword(password);
            this.setEmail(email);
            this.weight = w;
            this.height = h;
            this.bmi = (float)w / (((float)h/100)*((float)h/100));
            this.birthday = bYear;
            this.age = LocalDate.now().getYear() - birthday;
            this.limitations = l;
            this.sportPlan = new ArrayList<>();
            this.oldSportPlan = new ArrayList<>();
            this.hasCoach = false;
            this.hasNutritionist = false;
        }        
    }
    
    public int getWeight(){
        return this.weight;
    }
    public int getHeight(){
        return this.height;
    }
    public float getBmi(){
        return this.bmi;
    }
    public int getAge(){
        return this.age;
    }
    public String getLimitations(){
        return this.limitations;
    }
    public Boolean getHasCoach(){
        return this.hasCoach;
    }
    public void setHasCoach(Boolean h){
        this.hasCoach = h;
    }
    public Boolean getHasNutritionist(){
        return this.hasNutritionist;
    }
    public void setHasNutritionist(Boolean h){
        this.hasNutritionist = h;
    }
    
    public void AddSportDay(SportDay s){
        this.sportPlan.add(s);
    
    }
    public void ModifyOwnData(int w, int h, String l){
        if (w < 30 || w > 220 || h < 120 || h > 230){
            // TODO EXCEPTION
        }
        else{
            this.weight = w;
            this.height = h;
            this.limitations = l;
            this.bmi = (float)w / (((float)h/100)*((float)h/100));
        }
    }
    
    
    public ArrayList<SportDay> getSportPlan(){
        return this.sportPlan;
    }
    public ArrayList<SportDay> getOldSportPlan(){
        return this.oldSportPlan;
    }
    
    public void OrderPlans(){
        this.sportPlan.sort((elemento1, elemento2)->elemento1.compareTo(elemento2));
        this.oldSportPlan.sort((elemento1, elemento2)->elemento1.compareTo(elemento2));
        for(int i = 0; i< this.sportPlan.size(); i++){
            if (this.sportPlan.get(i).getDate().compareTo(LocalDate.now()) < 0){
                SportDay s = this.sportPlan.get(i);
                this.sportPlan.remove(s);
                this.oldSportPlan.add(s);
                
            
            }
        }
    }
    public String[] ViewOldSportPlan(){
        String[] dates = new String[this.oldSportPlan.size()];
        for (int i = 0; i < this.oldSportPlan.size(); i++){
            dates[i] = this.oldSportPlan.get(i).getDate().toString();
        }
        return dates;
    }
    
    public String[] ViewSportPlan(){
        String[] dates = new String[this.sportPlan.size()];
        for (int i = 0; i < this.sportPlan.size(); i++){
            dates[i] = this.sportPlan.get(i).getDate().toString();
        }
        return dates;
        
    }
   
}
