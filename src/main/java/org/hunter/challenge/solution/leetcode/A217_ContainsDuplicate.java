package org.hunter.challenge.solution.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hunter on 5/04/2018.
 */



public class A217_ContainsDuplicate {
    public static void main(String[]args){
        System.out.println();
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            if(set.contains(cur)){
                return true;
            }else {
                set.add(cur);
            }
        }
        return false;
    }
}
