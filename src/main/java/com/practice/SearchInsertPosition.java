package com.practice;

import org.junit.Assert;

public class SearchInsertPosition {
    public static void main(String[] input) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        Assert.assertEquals(2, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 5));
        Assert.assertEquals(1, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2));
        Assert.assertEquals(4, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 7));
        Assert.assertEquals(0, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 0));
    }

    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i<nums.length) {
            if (target<=nums[i]){
                return i;
            }
            i++;
        }
        return i;
    }
}


