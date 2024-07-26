/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai19lv3;

/**
 *
 * @author ADMIN
 */
public class Bai19lv3 {

    public static void main(String[] args) {
        int n = 5;
        double result = calculateS(n);
        System.out.println("S(" + n + ") = " + result);
    }

    public static double calculateS(int n) {
        double result = 2;
        for (int i = 0; i < n; i++) {
            result = Math.sqrt(2 + result);
        }
        return result;
    }
}
