/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai9lv2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai9lv2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount P: ");
        double P = scanner.nextDouble();
        System.out.print("Enter the monthly interest rate r (in decimal form, e.g. 0.05 for 5%): ");
        double r = scanner.nextDouble();
        System.out.print("Enter the number of months n: ");
        int n = scanner.nextInt();

        double F = P * Math.pow(1 + r, n);
        System.out.printf("The future value F after %d months is: %.2f%n", n, F);
    }
}
