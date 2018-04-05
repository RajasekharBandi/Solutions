package org.hunter.challenge.solution.leetcode;

import java.util.HashSet;
import java.util.Set;

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
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        return set.size();
    }
}
