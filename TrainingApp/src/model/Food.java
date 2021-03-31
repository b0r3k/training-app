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
public class Food {
    private String name;
    private int weightGrams;
    private String recipe;
    
    public Food(String n, int w, String r){
        this.name = n;
        this.weightGrams = w;
        this.recipe = r;
    }
    
    public String getName(){
        return this.name;
    }
    public int getWeightGrams(){
        return this.weightGrams;
    }
    public String getRecipe(){
        return this.recipe;
    }
}
