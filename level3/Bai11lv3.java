/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai11lv3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai11lv3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number n: ");
        int n = sc.nextInt();
        
        double result = calculateS(n);
        System.out.println("S(" + n + ") = " + result);
    }
    
    public static double calculateS(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double term = 1;
            for (int j = 1; j <= i; j++) {
                term *= j;
            }
            sum += term;
        }
        return sum;
    }
}
