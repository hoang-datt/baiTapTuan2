/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai31lv3;

/**
 *
 * @author ADMIN
 */
public class Bai31lv3 {

    public static void main(String[] args) {
        int n = 12345;
        int largestDigit = findLargestDigit(n);
        System.out.println("Largest digit of " + n + ": " + largestDigit);
    }

    public static int findLargestDigit(int n) {
        int largest = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > largest) {
                largest = digit;
            }
            n /= 10;
        }
        return largest;
    }
}
