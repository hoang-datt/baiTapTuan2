/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai10lv3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai10lv3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number n: ");
        double n = sc.nextDouble();
        
        System.out.println("Enter exponent x: ");
        int x = sc.nextInt();
        
        double result = power(n, x);
        System.out.println("to the power of " + n + " is:" + result);
    }

    private static double power(double x ,int n) {
        if( n == 0) {
            return 1;
        }else {
            return x * power(x, n - 1);
        }
    }
}
