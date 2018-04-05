package org.hunter.challenge.solution.codility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hunter on 1/04/2018.
 * 100%
 */
public class L9_MaxProfit {

    public static int solution(int[] A){
        int max=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            minPrice=Math.min(minPrice,A[i]);
            max=Math.max(max,A[i]-minPrice);
        }
        return max;
    }

    public static int solution2(int[] A){
        int max=0;
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                max=Math.max(max,A[j]-A[i]);
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr={23171,21011,21123,21366,21013,21367};

        System.out.println(solution(arr));
    }
}
