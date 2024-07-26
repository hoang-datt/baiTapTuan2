/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2lv1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai2lv1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter line number");
        int number = sc.nextInt();
        
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
