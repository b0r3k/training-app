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
public class Nutritionist extends SportAdvisor {
    
    public Nutritionist(String name, String password, String email, String expertise){
        this.setName(name);
        this.setPassword(password);
        this.setEmail(email);
        this.setExpertise(expertise);
        this.groupAthletes = new ArrayList<>();
        this.pendingRequests = new ArrayList<>();
    }
    
    public void AcceptAthlete(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
