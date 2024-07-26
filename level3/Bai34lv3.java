/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai34lv3;

/**
 *
 * @author ADMIN
 */
public class Bai34lv3 {

    public static void main(String[] args) {
        int n = 4680;
        boolean allEvenDigits = hasAllEvenDigits(n);
        System.out.println("Does " + n + " have all even digits? " + allEvenDigits);
    }

    public static boolean hasAllEvenDigits(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2!= 0) { 
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
