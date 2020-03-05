package com.practice;

import com.sun.tools.javac.util.Assert;

public class MaxSqrtCount {

    public static void main(String[] args) {
        MaxSqrtCount maxSqrtCount = new MaxSqrtCount();
        int answer = maxSqrtCount.solution(10, 20);
        Assert.check(answer == 2);

        answer = maxSqrtCount.solution(6000, 7000);
        Assert.check(answer == 3);

        answer = maxSqrtCount.solution(2, 2);
        Assert.check(answer == 0);

        answer = maxSqrtCount.solution(1000000000, 1000000000);
        Assert.check(answer == 0);

        answer = maxSqrtCount.solution(2, 10000);
        Assert.check(answer == 3);

        answer = maxSqrtCount.solution(2, 100000);
        Assert.check(answer == 4);

        answer = maxSqrtCount.solution(2, 1000000);
        Assert.check(answer == 4);

        answer = maxSqrtCount.solution(2, 10000000);
        Assert.check(answer == 4);

        answer = maxSqrtCount.solution(2, 100000000);
        Assert.check(answer == 4);

        answer = maxSqrtCount.solution(2, 1000000000);
        Assert.check(answer == 4);

        answer = maxSqrtCount.solution(65537, 1000000000);
        Assert.check(answer == 4);

        answer = maxSqrtCount.solution(43046721, 1000000000);
        Assert.check(answer == 4);

        answer = maxSqrtCount.solution(43046722, 1000000000);
        Assert.check(answer == 3);

    }

    public int solution(int A, int B) {
        System.out.println("input = " + A + " " + B);
        // write your code in Java SE 8
        int maxCount = 0, counter, input, seed = 0;
        double sqrt;

        for (int i = A; i <= B; i++) {
            counter = 0;
            sqrt = Math.sqrt(i);
            input = (int) sqrt;
            while (input == sqrt) {
                counter++;
                sqrt = Math.sqrt(input);
                input = (int) sqrt;
            }
            if (counter == 4) {
                System.out.println("answer is " + counter + " for the number = " + i);
                return counter;
            }
            if (counter > maxCount) {
                maxCount = counter;
                seed = i;
            }
        }
        System.out.println("answer is " + maxCount + " for the number = " + seed);
        return maxCount;
    }

}
