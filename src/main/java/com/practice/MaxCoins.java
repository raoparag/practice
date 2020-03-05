package com.practice;

import java.util.Arrays;

public class MaxCoins {
    public static void main(String[] args) {
        //empty arr
        int[] arr1 = {};
        getMaxCoins(arr1);

        int[] arr2 = {1, 2, 3, 1};
        getMaxCoins(arr2);

        int[] arr3 = {0, 2, 1, 1, 4};
        getMaxCoins(arr3);

    }

    public static void getMaxCoins(int[] tables) {
        System.out.println("Input is - " + Arrays.toString(tables));
        int maxSum = 0;
        if (tables.length > 0) {
            int sum1 = getMaxCoins(tables, 0);
            int sum2 = getMaxCoins(tables, 1);
            maxSum = Math.max(sum1, sum2);
        }
        System.out.println("Max coins - " + maxSum);
    }

    public static int getMaxCoins(int[] tables, int startTable) {
        if (startTable >= tables.length) return 0;
        else {
            int sum1 = tables[startTable] + getMaxCoins(tables, startTable + 2);
            int sum2 = tables[startTable] + getMaxCoins(tables, startTable + 3);
            return Math.max(sum1, sum2);
        }

    }
}
