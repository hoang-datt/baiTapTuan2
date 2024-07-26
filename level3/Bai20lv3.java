/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai20lv3;

/**
 *
 * @author ADMIN
 */
public class Bai20lv3 {

    public static void main(String[] args) {
        int n = 5;
        double result = calculateS(n);
        System.out.println("S(" + n + ") = " + result);
    }

    public static double calculateS(int n) {
        double result = Math.sqrt(1);
        for (int i = 2; i <= n; i++) {
            result = Math.sqrt(i + result);
        }
        return result;
    }
}
