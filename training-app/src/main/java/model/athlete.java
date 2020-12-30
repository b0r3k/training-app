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
public class Athlete extends User {
    public int weight;
    public int height;
    public int imc;
    public String limitations;
    
    //Add constructor here
    
    public ArrayList<Coach> SeeCoaches(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public ArrayList<Nutritionist> SeeNutritionists(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void CoachAvailability(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void NutritionistAvailability(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void Modify(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
