/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai18lv3;

/**
 *
 * @author ADMIN
 */
public class Bai18lv3 {

    public static void main(String[] args) {
        int n = 100;
        int largestOddDivisor = findLargestOddDivisor(n);
        System.out.println("Largest odd divisor of " + n + " is " + largestOddDivisor);
    }

    public static int findLargestOddDivisor(int n) {
        int largestOddDivisor = 1;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                largestOddDivisor = i;
            }
        }
        return largestOddDivisor;
    }
}
