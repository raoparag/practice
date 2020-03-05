package com.practice;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] input) {
        //null input
        search(1, null);

        //empty arr
        int[] arr1 = {};
        search(1, arr1);

        //odd number of elements, element present
        int[] arr2 = {3, 4, 5};
        search(5, arr2);

        //even number of elements, element present
        int[] arr3 = {3, 4, 5, 6};
        search(5, arr3);

        //repeasting elements, element present
        int[] arr6 = {3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6};
        search(5, arr6);

        //element absent
        int[] arr4 = {3, 4, 5};
        search(5, arr4);

        //large input
        int[] arr5 = new int[100000000];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = i;
        }
        search(arr5.length - 1, arr5);
    }

    public static void search(int x, int[] arr) {
        if (arr != null) {
            Arrays.sort(arr);
            if (arr.length < 20) System.out.println(Arrays.toString(arr));
            int location = search(x, arr, 0, arr.length - 1);
            if (location > -1)
                System.out.println("found " + x + " at position " + location);
            else
                System.out.println("did not find " + x);
        } else
            System.out.println("Null Input not allowed");
    }

    public static int search(int x, int[] arr, int startIndex, int endIndex) {
        if (startIndex > endIndex) return -1;
        int mid = startIndex + ((endIndex - startIndex) / 2);
        if (x < arr[mid])
            return search(x, arr, startIndex, mid);
        else if (x > arr[mid])
            return search(x, arr, mid + 1, endIndex);
        else
            return mid;
    }
}
