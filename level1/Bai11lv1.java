/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai11lv1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai11lv1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a posival integer of n: ");
        int n = sc.nextInt();
        
        double sum = 1.0;
        for(int i = 2; i <= n; i++) {
            sum += 1.0 / Math.pow(i, 3);
        }
        System.out.printf("The result of expression S is: %.5f%n", sum);
    }
}
