package org.hunter.challenge.solution.leetcode;

/**
 * Created by Hunter on 16/03/2018.
 */
public class A326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(0));

    }

    public static boolean isPowerOfThree(int n) {

        while (n %3 ==0){
            n/=3;
        }
        return n==1;
    }
}
