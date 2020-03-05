package com.practice;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        //empty arr
        int[] arr1 = {};
        twoSum(arr1, 0);
        System.out.println(Arrays.toString(twoSum(arr1, 6)));

        int[] arr2 = {2,7,11,15};
        twoSum(arr2, 9);
        System.out.println(Arrays.toString(twoSum(arr2, 6)));

        int[] arr3 = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr3, 6)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++) {
                if ((nums[i]+nums[j]) == target)
                    ans[0] = i;
                ans[1] = j;
                return ans;
            }
        }
        return ans;
    }

}
