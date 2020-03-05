package com.practice;

public class Palindrome1 {
    public static void main(String[] args) {
        Palindrome1 palindrome1 = new Palindrome1();
        System.out.println(palindrome1.check(""));
        System.out.println(palindrome1.check("s"));
        System.out.println(palindrome1.check("madam"));
        System.out.println(palindrome1.check("missingnisdsim"));
        System.out.println(palindrome1.check("misjsingnissim"));
        System.out.println(palindrome1.check("misjsingnishsim"));
    }

    public boolean check(String str) {
        System.out.println(str);
        int i = 0, j = str.length() - 1, strike = 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                if (strike > 0) {
                    strike--;
                    if (str.charAt(i + 1) == str.charAt(j)) i++;
                    else if (str.charAt(i) == str.charAt(j - 1)) j--;
                    else return false;
                } else
                    return false;
            i++;
            j--;
        }
        return true;
    }
}
