/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai23lv3;

/**
 *
 * @author ADMIN
 */
public class Bai23lv3 {

    public static void main(String[] args) {
        int n = 12345;
        int digitCount = countDigits(n);
        System.out.println("Number of digits in " + n + ": " + digitCount);
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
