/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter length = ");
        int length = sc.nextInt();
        
        System.out.println("Enter width = ");
        int width = sc.nextInt();
        
        for(int i = 0; i <= length; i++) {
            for (int j = 0; j <= width; j++) {
                if(i == 0 || i == length || j ==0 || j == width) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
