/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai8lv1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai8lv1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.println("The first elements of the Fibonacci sequence are: ");
        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
