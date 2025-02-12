package com.nhlstenden;

public class MeanOfArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array
        double mean = computeMean(array);
        System.out.println("Mean of the array is: " + mean);
    }

    public static double computeMean(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
