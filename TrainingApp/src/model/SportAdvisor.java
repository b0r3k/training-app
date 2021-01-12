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
public abstract class SportAdvisor extends User {
    private String expertise;
    protected ArrayList<Athlete> groupAthletes;
    protected ArrayList<AvailabilityRequest> pendingRequests;
    
    protected void setExpertise(String expertise){
        this.expertise = expertise;
    }
    public String getExpertise(){
        return this.expertise;
    }
    
    protected void ModifyOwnData(String e){
        this.setExpertise(e);
    }
}
