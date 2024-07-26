/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai22lv3;

/**
 *
 * @author ADMIN
 */
public class Bai22lv3 {

    public static void main(String[] args) {
        int n = 5;
        double result = calculateS(n);
        System.out.println("S(" + n + ") = " + result);
    }

    public static double calculateS(int n) {
        double result = 1.0;
        for (int i = 0; i < n; i++) {
            result = 1 / (1 + result);
        }
        return result;
    }
}
