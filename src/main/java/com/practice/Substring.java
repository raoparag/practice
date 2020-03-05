package com.practice;

import org.junit.Assert;

public class Substring {
    public static void main(String[] args) {
        Substring substring = new Substring();
        Assert.assertEquals(1, substring.strStr("madam", "ad"));
    }
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;
        int i=0, j;
        while (i < haystack.length()) {
            j=0;
            while (i < haystack.length() && haystack.charAt(i) != needle.charAt(j))
                i++;
            while (j < needle.length() && (i+j) < haystack.length() && haystack.charAt(i+j) == needle.charAt(j))
                j++;
            if (j==needle.length()) return i;
            i++;
        }
        return -1;
    }
}