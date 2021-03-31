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
public class Exercise {
    private String name;
    private int length;
    private BasedOn basedOn;

    public Exercise(String name, int length, BasedOn basedOn) {
        this.name = name;
        this.length = length;
        this.basedOn = basedOn;
    }
    
    public String getName(){
        return this.name;
    }
    public int getLength(){
        return this.length;
    }
    public BasedOn getBasedOn(){
        return this.basedOn;
    }
}
