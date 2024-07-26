/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai9lv3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai9lv3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = sc.nextInt();
        int count = sc.nextInt();
        
        do {
            System.out.println("Enter number n: ");
        } while (n < 1);
         
        for (int i = 1; i <= n; i++) {
            count *= i;
            sum += count;
        }
        System.out.println("S(" + n + ") = " + sum);
    }    
}
