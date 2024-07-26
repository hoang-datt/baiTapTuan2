/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai27lv3;

/**
 *
 * @author ADMIN
 */
public class Bai27lv3 {

    public static void main(String[] args) {
        int n = 12345;
        int sum = sumOfEvenDigits(n);
        System.out.println("Sum of even digits of " + n + ": " + sum);
    }

    public static int sumOfEvenDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }
}
