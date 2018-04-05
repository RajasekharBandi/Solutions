package org.hunter.challenge.solution.leetcode;

/**
 * Created by Hunter on 5/04/2018.
 */

public class A283 {
    public static void main(String[] args) {
        int[] arr={1,0};
        moveZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
//        System.out.println(moveZeroes(arr));
    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while (i<=j &&j < nums.length) {

            if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if (nums[i] != 0) {
                i++;
            }
            j++;
        }

    }
}
