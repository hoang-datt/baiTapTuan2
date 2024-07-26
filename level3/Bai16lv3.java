/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai16lv3;

/**
 *
 * @author ADMIN
 */
public class Bai16lv3 {

    public static void main(String[] args) {
        double x = 2.0;
        int n = 5;
        double result = calculateS(x, n);
        System.out.println("S(" + x + ", " + n + ") = " + result);
    }

    public static double calculateS(double x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i) / factorial(i);
        }
        return sum;
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
