/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai25lv3;

/**
 *
 * @author ADMIN
 */
public class Bai25lv3 {

    public static void main(String[] args) {
        int n = 12345;
        int digitProduct = productOfDigits(n);
        System.out.println("Product of digits of " + n + ": " + digitProduct);
    }

    public static int productOfDigits(int n) {
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) {
                return 0;
            }
            product *= digit;
            n /= 10;
        }
        return product;
    }
}
