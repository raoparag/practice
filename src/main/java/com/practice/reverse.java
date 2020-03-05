package com.practice;

public class reverse {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }

    public static int reverse(int x) {
        if (x == 0) return x;
        int mul = x / Math.abs(x);
        char[] strx = String.valueOf(x).toCharArray();
        int ans = 0, start = 0;
        if (mul == -1) start = 1;
        for (int i = start;  i < strx.length; i++){
            ans = ans + (Integer.parseInt(strx[i]+"") * mul);
            mul = mul *10;
        }
        return ans;
    }

}
