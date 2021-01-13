/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;

/**
 *
 * @author borek
 */
public enum BasedOn {
    TIME{
        public String toString(){
            return "seconds";
        }
    },
    REPS{
        public String toString(){
            return "reps";
        }
    }
}
