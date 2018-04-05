package org.hunter.challenge.solution.leetcode;

/**
 * Created by Hunter on 5/04/2018.
 */


public class A238 {
    public static void main(String[] args) {
        int[] arr = {1, 0};
        int[] res = solution(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

    public static int[] solution(int[] arr) {
        int product = 1;
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                product *= arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                res[i] = product / arr[i];
            }

        }

        return res;
    }
}
