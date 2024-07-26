/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai6lv2;

/**
 *
 * @author ADMIN
 */
public class Bai6lv2 {

    public static void main(String[] args) {
        for (int angle = 0; angle <= 900; angle += 50) {
            double radians = Math.toRadians(angle);
            double sin = Math.sin(radians);
            double cos = Math.cos(radians);
            double tan = Math.tan(radians);
            double cotan = 1 / tan;

            System.out.println("Angle: " + angle + "°");
            System.out.println("Sin: " + sin);
            System.out.println("Cos: " + cos);
            System.out.println("Tan: " + tan);
            System.out.println("Cotan: " + cotan);
            System.out.println();
        }
    }
}
