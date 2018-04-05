package org.hunter.challenge.solution.leetcode;

import scala.Int;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hunter on 5/04/2018.
 */


public class A136 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i< nums.length;i++){
            int cur=nums[i];
            if(set.contains(cur)){
                set.remove(cur);
            }else {
                set.add(cur);
            }
        }
        return set.iterator().next();

    }
}
