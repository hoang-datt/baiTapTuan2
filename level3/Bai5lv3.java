/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai5lv3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai5lv3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number n: ");
        int n = sc.nextInt();
        
        
        double sum = 0.0;
        for(int i = 1; i <= n; i++) {
            sum += 1.0 / (2 * i + 1);
        }
        System.out.println("S(" + n + ") =" + sum);
    }
}
