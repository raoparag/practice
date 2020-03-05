package com.practice;

import java.util.Arrays;

public class FindMinInteger {

    public static void main(String[] args) {
        FindMinInteger findMinInteger = new FindMinInteger();
        int[] input1 = {1, 2, 3, 4, 6};
        System.out.println("answer is " + findMinInteger.solution(input1));
        int[] input2 = {1};
        System.out.println("answer is " + findMinInteger.solution(input2));
        int[] input3 = {2};
        System.out.println("answer is " + findMinInteger.solution(input3));
        int[] input4 = {-3,-1};
        System.out.println("answer is " + findMinInteger.solution(input4));
        int[] input5 = {0,2,4,5,8};
        System.out.println("answer is " + findMinInteger.solution(input5));
    }

    public int solution(int[] A) {
        System.out.println("input = " + Arrays.toString(A));
        // write your code in Java SE 8
        //Boundary condition - one element
        if (A.length == 1) return ((A[0] == 1) ? 2 : 1);

        Arrays.sort(A);

        //Boundary condition - all negative
        if (A[A.length - 1] < 0) return 1;
        //Boundary condition - does not contain 1
        if (A[0] != 1) return 1;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > 0 && (A[i + 1] != A[i]) && (A[i + 1] - A[i] != 1)) return (A[i] + 1);
        }
        return (A[A.length - 1] + 1);
    }

}
