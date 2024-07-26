/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai14lv3;

/**
 *
 * @author ADMIN
 */
public class Bai14lv3 {

    public static void main(String[] args) {
        double x = 2.0;
        int n = 5; 
        double result = calculateS(x, n);
        System.out.println("S(" + x + ", " + n + ") = " + result);
    }

    public static double calculateS(double x, int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(x, 2 * i + 1);
        }
        return sum;
    }
}
