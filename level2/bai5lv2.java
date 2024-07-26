/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class bai5lv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a natural integer: ");
        int n = sc.nextInt();
        
        int largestOddDivisor = largestOddDivisor(n);
        System.out.println("Largest odd divisor of " + n + " is: " + largestOddDivisor);
        
        boolean isPrime = isPrime(largestOddDivisor);
        System.out.println("Is " + largestOddDivisor + " a prime number? " + isPrime);
        
        List<Integer> primeFactors = factorize(n);
        System.out.println("Prime factors of " + n + " is: " + primeFactors);
        
        List<Integer> primeNumbers = findPrimeNumbers(n);
        System.out.println("Prime numbers less than " + n + " is: " + primeNumbers);
    }

    private static int largestOddDivisor(int n) {
        int largestOddDivisor = 1;
        for(int i = 3; i < Math.sqrt(n); i += 2) {
            if ( n % i == 0) {
                largestOddDivisor = i;
            }
        }
        return largestOddDivisor;
    }

    private static boolean isPrime(int num) {
        if ( num <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if( num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> factorize(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            while( n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        return primeFactors;
    }

    private static List<Integer> findPrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        for(int i = 2; i < n; i++) {
            if(isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
