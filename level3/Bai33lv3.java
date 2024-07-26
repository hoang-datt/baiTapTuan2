/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai33lv3;

/**
 *
 * @author ADMIN
 */
public class Bai33lv3 {

    public static void main(String[] args) {
        int n = 13579;
        boolean allOddDigits = hasAllOddDigits(n);
        System.out.println("Does " + n + " have all odd digits? " + allOddDigits);
    }

    public static boolean hasAllOddDigits(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
