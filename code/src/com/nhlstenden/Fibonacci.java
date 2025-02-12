package com.nhlstenden;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(computeFibonacci(i) + " ");
        }
    }

    public static int computeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fibPrev = 0, fibCurr = 1;
        for (int i = 2; i <= n; i++) {
            int fibNext = fibPrev + fibCurr;
            fibPrev = fibCurr;
            fibCurr = fibNext;
        }
        return fibCurr;
    }
}
