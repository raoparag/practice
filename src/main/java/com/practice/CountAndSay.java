package com.practice;

import org.junit.Assert;

public class CountAndSay {

    public static void main(String[] input) {
        CountAndSay countAndSay = new CountAndSay();
        Assert.assertEquals("1", countAndSay.countAndSay(1));
        Assert.assertEquals("11", countAndSay.countAndSay(2));
        Assert.assertEquals("21", countAndSay.countAndSay(3));
        Assert.assertEquals("1211", countAndSay.countAndSay(4));
        Assert.assertEquals("111221", countAndSay.countAndSay(5));
    }

    public String countAndSay(int n) {
        String output = "1";
        for (int i = 2; i <= n; i++) {
            output = worker(output);
        }
        return output;
    }

    public String worker(String input) {
        if (input.length() == 0) return "";
        if (input.length() == 1) return "1" + input;
        StringBuilder output = new StringBuilder();
        int i = 0, j = 1;
        while (i < input.length() - 1) {
            if (input.charAt(i) == input.charAt(i + 1)) j++;
            else {
                output.append(j).append(input.charAt(i));
                j = 1;
            }
            i++;
        }
        output.append(j).append(input.charAt(i));
        return output.toString();
    }
}
