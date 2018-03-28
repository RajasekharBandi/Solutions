package org.hunter.challenge.solution.leetcode;

/**
 * Created by Hunter on 15/03/2018.
 */
public class A198_Notsure {
    public int rob(int[] nums) {
        //1,5,3,6,9,2,5
        //1,2,3,4,5,6
        int a = 0;
        int b = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a = max(a + nums[i], b);
            } else {
                b = max(a, b + nums[i]);
            }
        }
        return max(a, b);
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }
}
