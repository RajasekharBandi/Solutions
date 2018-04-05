package org.hunter.challenge.solution.leetcode;

/**
 * Created by Hunter on 5/04/2018.
 */


public class A268 {
    public static void main(String[] args) {
        int[] arr1={3,0,1};
        int[] arr2={0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(arr1));
        System.out.println(missingNumber(arr2));
        System.out.println(arr2);
    }

    public static int missingNumber(int[] nums) {
        int len=nums.length;
        int sum=0;
        int missingSum=0;
        for(int i=0;i<len;i++){
            sum+=i;
            missingSum+=nums[i];
        }
        return sum+len - missingSum;
    }
}
