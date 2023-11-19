/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

/**
 *
 * @author USER
 */
public class Lab7 {

    public static void main(String[] args) {
      Patient p1=new Patient ("Ali");
      Patient p2=new Patient ("Mohammed");
      Patient p3 =new Patient ("Mohanad");
      Patient p4=new Patient ("Hussam ");
       
      Patient [] patients={p1,p2,p3,p4};
        for(Patient i:patients){
            System.out.println(i.toString());
        }
    }
}
