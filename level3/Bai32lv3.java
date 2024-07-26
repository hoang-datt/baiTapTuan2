/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai32lv3;

/**
 *
 * @author ADMIN
 */
public class Bai32lv3 {

    public static void main(String[] args) {
        int n = 12345;
        int smallestDigit = findSmallestDigit(n);
        System.out.println("Smallest digit of " + n + ": " + smallestDigit);
    }

    public static int findSmallestDigit(int n) {
        int smallest = 9;
        while (n > 0) {
            int digit = n % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            n /= 10;
        }
        return smallest;
    }
}
