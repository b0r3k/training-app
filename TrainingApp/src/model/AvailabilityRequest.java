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
    
    public Athlete View(){
        return this.athleteAsking;
    }
}
