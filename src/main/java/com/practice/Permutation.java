package com.practice;

import java.util.HashSet;
import java.util.Set;

public class Permutation {
    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        permutation.permute("abc", new StringBuffer(), new HashSet<>(), 2);

    }

    public void permute(String instr, StringBuffer outstr, Set<Integer> prevIndexSet, int permSize)
    {
        for (int i = 0; outstr.length() < permSize && i < instr.length(); i++)
        {
            if (!prevIndexSet.contains(i)) {
                outstr.append(instr.charAt(i));
                prevIndexSet.add(i);
                permute(instr, outstr, prevIndexSet, permSize);
                if (outstr.length() == permSize) System.out.println(outstr);
                outstr.deleteCharAt(outstr.length() - 1);
                prevIndexSet.remove(i);
            }
        }
    }
}
