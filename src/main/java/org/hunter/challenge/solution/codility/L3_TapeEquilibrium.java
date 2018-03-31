package org.hunter.challenge.solution.codility;

import java.util.Arrays;

/**
 * Created by Hunter on 31/03/2018.
 * 100%
 */
public class L3_TapeEquilibrium {
    public static int solution(int[] A){
//        int sumRight= Arrays.stream(A).sum();
        int sumRight = 0;
        for (int number : A) {
            sumRight += number;
        }
        int min=2000;
        int sumLeft=0;
        for(int i=0;i<A.length-1;i++){
            sumLeft+=A[i];
            sumRight-=A[i];
            min=Math.min(min,Math.abs(sumLeft-sumRight));
//            int diff=Math.abs(sumLeft-sumRight);
//            if(min>diff){
//                min=diff;
//            }
        }
        return min;
    }

    public static void main(String[] args){
//        int[] arr={3,1,2,4,3};
        int[] arr={1000,-1000};
        System.out.println(solution(arr));
    }
}
