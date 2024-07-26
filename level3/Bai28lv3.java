/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai28lv3;

/**
 *
 * @author ADMIN
 */
public class Bai28lv3 {

    public static void main(String[] args) {
        int n = 12345;
        int product = productOfOddDigits(n);
        System.out.println("Product of odd digits of " + n + ": " + product);
    }

    public static int productOfOddDigits(int n) {
        int product = 1;
        boolean hasOddDigit = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                hasOddDigit = true;
                product *= digit;
            }
            n /= 10;
        }
        return hasOddDigit ? product : 0;
    }
}
