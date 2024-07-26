/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai15lv3;

/**
 *
 * @author ADMIN
 */
public class Bai15lv3 {

    public static void main(String[] args) {
        int n = 5;
        double result = calculateS(n);
        System.out.println("S(" + n + ") = " + result);
    }

    public static double calculateS(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double denominator = 0;
            for (int j = 1; j <= i; j++) {
                denominator += j;
            }
            sum += 1.0 / denominator;
        }
        return sum;
    }
}
