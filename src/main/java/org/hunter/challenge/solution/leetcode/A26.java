package org.hunter.challenge.solution.leetcode;

/**
 * Created by Hunter on 15/03/2018.
 */
public class A26 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4};
        System.out.println(removeDuplicates(arr));
        System.out.println();

        for(int num:arr){
            System.out.println(num);
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
