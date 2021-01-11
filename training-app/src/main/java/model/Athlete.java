/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author borek
 */
public class Athlete extends User {
    private int weight;         // kilograms
    private int height;         // centimetres
    private int bmi;
    private int age;            // now().getYear() - birthday.getYear()
    private LocalDate birthday;
    private String limitations;
    
    public Athlete(int w, int h, int bDay, int bMonth, int bYear, String l){
        if (w < 30 || w > 220 || h < 120 || h > 230 || bYear < 1900 || bDay < 1 || bDay > 31 || bMonth < 1 || bMonth > 12){
            // TODO EXCEPTION;
        }
        else{
            this.weight = w;
            this.height = h;
            this.bmi = w / ((h/100)*(h/100));
            this.birthday = LocalDate.of(bYear, bMonth, bDay);
            this.age = LocalDate.now().getYear() - this.birthday.getYear();
        }        
    }
    
    public void ModifyOwnData(int w, int h, String l){
        if (w < 30 || w > 220 || h < 120 || h > 230){
            // TODO EXCEPTION
        }
        else{
            this.weight = w;
            this.height = h;
            this.limitations = l;
        }
    }
}
