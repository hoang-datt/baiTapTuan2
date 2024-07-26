/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4lv1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai4lv1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter positive integer n: ");
        int n = sc.nextInt();
        
        if(isPrime(n)) {
            System.out.println(n + " is Prime.");
        }else {
            System.out.println(n + " is not Prime.");
        }
    }

    private static boolean isPrime(int n) {
       if(n <= 1) {
           return false;
       }
       for(int i = 2; i <= Math.sqrt(n); i++) {
           if(n % i == 0) {
               return false;
           }
       }
        return true;
    }
}
