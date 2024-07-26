/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai12lv3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai12lv3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 2.0; 
        int n = 5;
        double result = calculateS(x, n);
        System.out.println("S(" + x + ", " + n + ") = " + result);
    }

    public static double calculateS(double x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        return sum;
    }
}
