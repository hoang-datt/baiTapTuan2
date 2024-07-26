/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai5lv1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai5lv1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter positive integer n: ");
        int n = sc.nextInt();

        System.out.print("prime numbers from 1 to " + n + " is: ");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
