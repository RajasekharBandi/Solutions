package org.hunter.challenge.solution.leetcode;

import scala.Int;

/**
 * Created by Hunter on 5/04/2018.
 */


public class A121 {
    public static void main(String[] args) {
        System.out.println();
    }

    public int maxProfit(int[] prices) {
        int minPrice= Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            minPrice=Math.min(minPrice,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;
    }
}
