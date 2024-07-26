/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4lv2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai4lv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter natural number a: ");
        int a = sc.nextInt();
        
        System.out.println("Enter natural number b: ");
        int b = sc.nextInt();
        
        System.out.println("Greatest divisor of " + a + " and " + b + " is: " + gd(a, b));
        System.out.println("Smallest multiple of " + a + " and " + b + " is: " + sm(a, b));
        
        
    }

    private static int gd(int a, int b) {
        if ( b == 0) {
            return a;
        }
        return gd(b, a % b);
    }

    private static int sm(int a, int b) {
        return (a * b) / gd(a, b);
    }
}
