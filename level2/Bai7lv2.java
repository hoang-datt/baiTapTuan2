/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai7lv2;

/**
 *
 * @author ADMIN
 */
public class Bai7lv2 {

    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            System.out.println("The multiplication table " + i + " is: ");
        for(int j = 1; j <= 10; j++) {
            System.out.println(i + " x " + j + " = " + (i * j));
        }
        System.out.println();
        }
    }
}
