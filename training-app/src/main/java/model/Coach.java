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
    
    public Coach(String e){
        this.expertise = e;
        this.groupAthletes = new ArrayList<>();
        this.pendingRequests = new ArrayList<>();
    }
    
    public void ModifyOwnData(String e){
        this.expertise = e;
    }
    
    public void AcceptAthlete(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void RemoveAthlete(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void CreateTrainig(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
