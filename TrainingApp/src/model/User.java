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
public abstract class User {
    private String name;
    private String password;
    private String email;
    
    public String getName(){
        return this.name;
    }
    protected void setName(String name){
        this.name = name;
    }
    
    protected void setPassword(String password){
        this.password = password;
    }
    
    public String getEmail(){
        return this.email;
    }
    protected void setEmail(String email){
        this.email = email;
    }
}
