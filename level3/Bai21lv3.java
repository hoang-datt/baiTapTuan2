/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai21lv3;

/**
 *
 * @author ADMIN
 */
public class Bai21lv3 {

    public static void main(String[] args) {
        int n = 5;
        double result = calculateS(n);
        System.out.println("S(" + n + ") = " + result);
    }

    public static double calculateS(int n) {
        double result = n;
        for (int i = n - 1; i >= 1; i--) {
            result = Math.sqrt(i + result);
        }
        return result;
    }
}
