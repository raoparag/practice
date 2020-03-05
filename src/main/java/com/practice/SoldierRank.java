package com.practice;

import com.sun.tools.javac.util.Assert;

import java.util.Arrays;

public class SoldierRank {

    public static void main(String[] args) {
        SoldierRank findMinInteger = new SoldierRank();
        int[] input1 = {3, 4, 3, 0, 2, 2, 3, 0, 0};
        int answer = findMinInteger.solution(input1);
        System.out.println("answer is " + answer);
        Assert.check(answer == 5);

        int[] input2 = {0, 1};
        answer = findMinInteger.solution(input2);
        System.out.println("answer is " + answer);
        Assert.check(answer == 1);

        int[] input3 = {1000000000, 999999999};
        answer = findMinInteger.solution(input3);
        System.out.println("answer is " + answer);
        Assert.check(answer == 1);

        int[] input4 = {4, 2, 0};
        answer = findMinInteger.solution(input4);
        System.out.println("answer is " + answer);
        Assert.check(answer == 0);

        int[] input5 = {4, 4, 3, 3, 1, 0};
        answer = findMinInteger.solution(input5);
        System.out.println("answer is " + answer);
        Assert.check(answer == 3);

        int[] input6 = {0, 0, 0};
        answer = findMinInteger.solution(input6);
        System.out.println("answer is " + answer);
        Assert.check(answer == 0);

        int[] input7 = {1, 2, 3, 4, 5};
        answer = findMinInteger.solution(input7);
        System.out.println("answer is " + answer);
        Assert.check(answer == 4);

        int[] input8 = new int[100000];
        for (int i = 0; i < input8.length; i++) {
            input8[i] = i;
        }
        answer = findMinInteger.solution(input8);
        System.out.println("answer is " + answer);
        Assert.check(answer == 99999);

    }

    public int solution(int[] ranks) {
        System.out.println("input = " + Arrays.toString(ranks));
        // write your code in Java SE 8

        Arrays.sort(ranks);
        int totalCount = 0;
        int count = 1;

        for (int i = 0; i < ranks.length - 1; i++) {
            if (ranks[i] == ranks[i + 1]) {
                count++;
            } else {
                if (ranks[i + 1] - ranks[i] == 1) {
                    totalCount = totalCount + count;
                }
                count = 1;
            }
        }
        return totalCount;
    }

}
