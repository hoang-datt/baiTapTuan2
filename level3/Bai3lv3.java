/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3lv3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai3lv3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number n: ");
        int n = sc .nextInt();
        
        int sum = calculateSum(n);
        System.out.println("S(" + n + ") =" + sum);
    }

    private static int calculateSum(int n) {
        double sum = 0.0;
        for(int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return (int) sum;
    }
}
