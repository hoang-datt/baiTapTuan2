/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai29lv3;

/**
 *
 * @author ADMIN
 */
public class Bai29lv3 {

    public static void main(String[] args) {
        int n = 12345;
        int firstDigit = findFirstDigit(n);
        System.out.println("First digit of " + n + ": " + firstDigit);
    }

    public static int findFirstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
}
