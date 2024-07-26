/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai10lv;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai10lv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        if(sum == n) {
            System.out.println(n +" is a perfect number.");
        }else {
            System.out.println(n +" is not a perfect number");
        }
    }
}
