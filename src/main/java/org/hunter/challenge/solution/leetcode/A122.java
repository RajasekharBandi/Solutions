package org.hunter.challenge.solution.leetcode;

import java.util.Arrays;

/**
 * Created by Hunter on 5/04/2018.
 */


public class A122 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int solution(int[] arr) {
        int len=arr.length;
        int half=len/2;
        Arrays.sort(arr);
        return arr[half];
    }
}
