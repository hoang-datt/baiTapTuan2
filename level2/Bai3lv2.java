/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3lv2;



/**
 *
 * @author ADMIN
 */
public class Bai3lv2 {

    public static void main(String[] args) {
        int fatherAge = 35;
        int childAge = 4;
        
        int year = 0;
        while (true) {
            year++;
            fatherAge++;
            childAge++;
            
            if(fatherAge == 2 * childAge) {
                break;
            }    
        }
        System.out.println("After " + year + " year, the father's age will be twice the child's age.");
        System.out.println("Father's age: " + fatherAge);
        System.out.println("Child's age: " + childAge);
    }
}
