/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai8lv2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai8lv2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum S = 1 + 2 +... + " + n + " = " + sum);

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial " + n + "! = 1 x 2 x... x " + n + " = " + factorial);
    }
}
