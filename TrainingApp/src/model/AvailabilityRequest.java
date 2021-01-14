/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author borek
 */
public class AvailabilityRequest {
    private Athlete athleteAsking;
    
    public Athlete getAthleteAsking(){
        return this.athleteAsking;
    }
    
    public AvailabilityRequest(Athlete a){
        this.athleteAsking = a;
    }
    
    public String ViewAthlete(){
        Athlete athlete = this.athleteAsking;
        String name = athlete.getName();
        String weight = Integer.toString(athlete.getWeight());
        String height = Integer.toString(athlete.getHeight());
        String bmi = String.format("%.2f", athlete.getBmi());
        String age = Integer.toString(athlete.getAge());
        String limitations = athlete.getLimitations();
        return (name+", "+weight+" kg, "+height+" cm, BMI: "+bmi+", "+age+" yrs, Limitations:"+limitations);
    }
}
