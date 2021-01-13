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
    
    public ArrayList<AvailabilityRequest> getPendingRequests(){
        return this.pendingRequests;
    }
    
    public void ModifyOwnData(String e){
        this.setExpertise(e);
    }
    
    public void AddPendingRequest(AvailabilityRequest ar){
        this.pendingRequests.add(ar);
    }
    public Boolean RequestExists(Athlete athleteAsking){
        return pendingRequests.stream().anyMatch(ar -> ar.getAthleteAsking().equals(athleteAsking));
    }
    public String[] ViewRequestsAthletesInfos(){
        int numberRequests = this.pendingRequests.size();
        String[] athletesInfos = new String[numberRequests];
        for (int i=0; i<numberRequests; i++){
            athletesInfos[i] = this.pendingRequests.get(i).ViewAthlete();
        }
        return athletesInfos;
    }
    public void RemoveRequestFromIndex(int index){
        if (0 <= index && index < this.pendingRequests.size()){
            this.pendingRequests.remove(index);
        }
    }
    
    public void AddAthleteToGroup(Athlete athlete){
        this.groupAthletes.add(athlete);
    }
}
