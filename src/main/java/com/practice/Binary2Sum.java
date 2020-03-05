package com.practice;

public class Binary2Sum {
    public static void main(String[] args) {
        Binary2Sum binary2Sum = new Binary2Sum();
        binary2Sum.add("101", "110");
        binary2Sum.add("111", "111");
        binary2Sum.add("000", "001");

    }

    public void add(String s1, String s2) {
        int sum;
        int carry = 0, i=s1.length()-1, j=s2.length()-1;
        StringBuilder result = new StringBuilder();
        char s1c, s2c;
        while (i>=0 || j>=0){
            s1c = i>=0? s1.charAt(i):'0';
            s2c = j>=0? s2.charAt(j):'0';
            sum = 3 - ('1'-s1c) - ('1'-s2c) - (1-carry);
            result.insert(0,sum % 2);
            carry = sum / 2;
            i--;j--;
        }
        if (carry>0) result.insert(0,carry);
        System.out.println(s1 + " + " + s2 + " = " + result);
    }
}
