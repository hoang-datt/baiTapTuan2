/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2lv2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai2lv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();
        
        int count = countDigits(n);
        System.out.println("The number of digits of " + n + " is: " + count);
        
        int reverse = reverseNumber(n);
        System.out.println("The reverse of " + n + " is: " + reverse);
        
    }

    private static int countDigits(int n) {
       int count = 0;
       while(n != 0) {
           n /= 10;
           count++;
       }
       return count;
    }

    private static int reverseNumber(int n) {
        int reverse = 0;
        while(n != 0) {
            int digits = n % 10;
            reverse = reverse * 10 + digits;
            n /= 10;
        }
        return reverse;
    }
}
