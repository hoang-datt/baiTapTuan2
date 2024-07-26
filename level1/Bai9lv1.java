/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai9lv1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai9lv1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int x = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= x; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + x + " is: " + factorial);
    }
}
