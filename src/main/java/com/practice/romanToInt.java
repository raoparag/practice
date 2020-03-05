package com.practice;

public class romanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("MCM"));
    }

    public static int romanToInt(String s) {
        char[] input = s.toCharArray();
        char prevChar = 'U';
        int ans = 0;
        for (int i=input.length-1; i>0; i-- ) {
            ans = ans + valueOf(input[i], prevChar);
            prevChar = input[i];
        }
        return ans;
    }

    public static int valueOf(char x, char prevChar){
        switch(x){
            case 'I' :
                if ((prevChar == 'V') || (prevChar == 'X')) return -1;
                else return 1;
            case 'V' : return 5;
            case 'X' :
                if ((prevChar == 'L') || (prevChar == 'C')) return -10;
                else return 10;
            case 'L' : return 50;
            case 'C' :
                if ((prevChar == 'D') || (prevChar == 'M')) return -100;
                else return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }
}
