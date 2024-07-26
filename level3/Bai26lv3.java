/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai26lv3;

/**
 *
 * @author ADMIN
 */
public class Bai26lv3 {

    public static void main(String[] args) {
        int n = 12345;
        int count = countOddDigits(n);
        System.out.println("Number of odd digits in " + n + ": " + count);
    }

    public static int countOddDigits(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2!= 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
