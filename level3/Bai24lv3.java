/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai24lv3;

/**
 *
 * @author ADMIN
 */
public class Bai24lv3 {

    public static void main(String[] args) {
        int n = 12345;
        int digitSum = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + ": " + digitSum);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
