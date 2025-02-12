package com.nhlstenden;

public class Factorial {

    public static void main(String[] args) {
        int number = 5; // Example input
        long result = computeFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static long computeFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
