package com.practice;

public class Combination {
    public static void main(String[] args) {
        Combination combination = new Combination();
        combination.combine("abc", new StringBuffer(), 0);

    }

    public void combine(String instr, StringBuffer outstr, int index)
    {
        for (int i = index; i < instr.length(); i++)
        {
            outstr.append(instr.charAt(i));
            combine(instr, outstr, i + 1);
            System.out.println(outstr);
            outstr.deleteCharAt(outstr.length() - 1);
        }
    }
}
