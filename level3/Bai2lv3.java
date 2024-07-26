/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2lv3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai2lv3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of n: ");
        int n = sc.nextInt();
        
        int sum = calculateSum(n);
        System.out.println("S(" + n + ") =" + sum);
    }

    private static int calculateSum(int n) {
        return n * (n + 1) * ( 2 * n + 1) / 6;
    }
}
