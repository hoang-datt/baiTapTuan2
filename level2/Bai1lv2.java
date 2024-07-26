/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1lv2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1lv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int max = 0;
        System.out.println("Enter integers (enter 0 to stop): ");
        int n;
        while ((n = sc.nextInt()) != 0) {
            sum += n;
            count++;
            if (n > max) {
                max = n;
            }
        }
        double average = (double) sum / count;
        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Greatest value: " + max);
    }
}
