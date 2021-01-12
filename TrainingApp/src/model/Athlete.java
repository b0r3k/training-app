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
    private int bmi;
    private int age;            // now().getYear() - birthday.getYear()
    private int birthday;
    private String limitations;
    private ArrayList<SportDay> sportPlan;
    private ArrayList<SportDay> oldSportPlan;
    
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
            this.bmi = w / ((h/100)*(h/100));
            this.birthday = bYear;
            this.age = LocalDate.now().getYear() - birthday;
            this.limitations = l;
            this.sportPlan = new ArrayList<>();
            this.oldSportPlan = new ArrayList<>();
        }        
    }
    
    public int getWeight(){
        return this.weight;
    }
    public int getHeight(){
        return this.height;
    }
    public String getLimitations(){
        return this.limitations;
    }
    
    public void ModifyOwnData(int w, int h, String l){
        if (w < 30 || w > 220 || h < 120 || h > 230){
            // TODO EXCEPTION
        }
        else{
            this.weight = w;
            this.height = h;
            this.limitations = l;
        }
    }
    
    public ArrayList<SportDay> ViewSportPlan(){
        return this.sportPlan;
    }
    
    public ArrayList<SportDay> ViewOldSportPlan(){
        return this.oldSportPlan;
    }
}
