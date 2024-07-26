/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai7lv1;

import static java.lang.Integer.reverse;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai7lv1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        
        int reverse = reverseNumber(n);
        System.out.println("The reverse of " + n + " is: " + reverse);

    }

    private static int reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }
}    
