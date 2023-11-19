/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author USER
 */
public class Patient {
    private int patientId ;
    private String name ;
    static int count =0;
    
    
    public Patient (String name ){
        this.name=name;
        
        this.patientId=++count;
    }
    
    public String getName(){
        return this.name ;
    }
    
    public int getPatient(){
        return this.patientId;
    }
    
    
    public String toString (){
        return "patient name : "+this.name+" "+"patient id : "+this.patientId;
    }
}
