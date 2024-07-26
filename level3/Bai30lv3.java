/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai30lv3;

/**
 *
 * @author ADMIN
 */
public class Bai30lv3 {

    public static void main(String[] args) {
        int n = 12345;
        int reverse = findReverse(n);
        System.out.println("Reverse of " + n + ": " + reverse);
    }

    public static int findReverse(int n) {
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }
}
