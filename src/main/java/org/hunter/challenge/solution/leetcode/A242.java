package org.hunter.challenge.solution.leetcode;

import java.util.Arrays;

/**
 * Created by Hunter on 5/04/2018.
 */


public class A242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("",""));
    }

    public static boolean isAnagram(String s, String t) {
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
}
