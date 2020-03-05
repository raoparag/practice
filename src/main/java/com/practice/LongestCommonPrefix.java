package com.practice;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "aflight"});
        longestCommonPrefix.longestCommonPrefix(new String[]{"", "", ""});
        longestCommonPrefix.longestCommonPrefix(new String[]{"aa", "a"});
        longestCommonPrefix.longestCommonPrefix(new String[]{});

    }

    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        boolean prefixCheck = (strs.length > 0);
        for (int j = 0; prefixCheck && j < strs[0].length(); j++) {
            for (int i = 1; prefixCheck && i < strs.length; i++) {
                if ((strs[i].length() <= j) || (strs[i].charAt(j) != strs[0].charAt(j)))
                    prefixCheck = false;
            }
            if (prefixCheck) sb.append(strs[0].charAt(j));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
