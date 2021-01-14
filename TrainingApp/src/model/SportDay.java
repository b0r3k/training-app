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
public class SportDay implements Comparable<SportDay>{
    private LocalDate date;
    private ArrayList<Exercise> training;
    private ArrayList<Food> foods;
    
    // TODO constructor
    public SportDay(int d, int m , int y){
        this.date = LocalDate.of(y,m,d);;
        this.training = new ArrayList<>();
        this.foods = new ArrayList<>();
    }
    
    public LocalDate getDate(){
        return this.date;
    }
    
    public ArrayList<Exercise> getTraining(){
        return this.training;
    }
    
    public ArrayList<Food> getFoods(){
        return this.foods;
    }
    
    public void AddFood(Food f){
        this.foods.add(f);
    }
    
    public void RemoveFood(Food f){
        this.foods.remove(f);
    
    }
    public void MoveFoodUp(Food f){
        if(this.foods.size() > 1 && this.foods.indexOf(f)> 0){
            int pos = this.foods.indexOf(f)-1 ;
            this.foods.remove(f);
            this.foods.add(pos, f);
        }
        
        
        
        
     }
    
     public void MoveFoodDown(Food f){
        if(this.foods.size() > 1 && this.foods.indexOf(f)< this.foods.size()-1){
            int pos = this.foods.indexOf(f)+1 ;
            this.foods.remove(f);
            this.foods.add(pos, f);
        }
        
     }
     
     public void AddExcer(Exercise e){
        this.training.add(e);
    }
    
    public void RemoveExcer(Exercise e){
        this.training.remove(e);
    }
     
    public void MoveExerUp(Exercise e){
        if(this.training.size() > 1 && this.training.indexOf(e)> 0){
            int pos = this.training.indexOf(e)-1 ;
            this.training.remove(e);
            this.training.add(pos, e);
        }
        
        
     
        
     }
     public void MoveExerDown(Exercise e){
        if(this.training.size() > 1 && this.training.indexOf(e)< this.training.size()-1){
            int pos = this.training.indexOf(e)+1 ;
            this.training.remove(e);
            this.training.add(pos, e);
        }
        
     }
     
     public String[] ViewFoods(){
        int numberFoods = this.foods.size();
        String[] foods = new String[numberFoods];
        for (int i=0; i<numberFoods; i++){
            foods[i] = this.foods.get(i).getName();
        }
        return foods;
    }
      public String[] ViewTraining(){
        int numberExcer = this.training.size();
        String[] excercise = new String[numberExcer];
        for (int i=0; i<numberExcer; i++){
            excercise[i] = this.training.get(i).getName();
        }
        return excercise;
    }
      
      @Override
      public int compareTo(SportDay other){
          return this.getDate().compareTo(other.getDate());
        
              
              
          
          
      }
     
}
