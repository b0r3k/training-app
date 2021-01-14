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
    private ArrayList<Food> myFoods;
    
    public Nutritionist(String name, String password, String email, String expertise){
        this.setName(name);
        this.setPassword(password);
        this.setEmail(email);
        this.setExpertise(expertise);
        this.groupAthletes = new ArrayList<>();
        this.pendingRequests = new ArrayList<>();
        this.myFoods = new ArrayList<>();
    }
    
    
    public  ArrayList<Food> getMyFoods(){
        return this.myFoods;
    }
    public String[] ViewFoods(){
        int numberFoods = this.myFoods.size();
        String[] viewFoods = new String[numberFoods];
        for (int i=0; i<numberFoods; i++){
            Food f = myFoods.get(i);
            String FoodName = f.getName();
            String FoodWeight = Integer.toString(f.getWeightGrams());
            
            viewFoods[i] = FoodName + ", " + FoodWeight + "[" + f.getRecipe()+ "]";
        }
        return viewFoods;
    }
    
    public void AddFood(Food food){
        this.myFoods.add(food);
    }
}
