package org.hunter.challenge.solution.codility;

import java.util.Arrays;

/**
 * Created by Hunter on 1/04/2018.
 */
public class L6_Triangle {
    public int solution(int[] A){
        Arrays.sort(A);
        for(int i=0;i<A.length-2;i++){
            if((long)A[i] + A[i+1] > A[i+2]){
                return 1;
            }
        }
        return 0;
    }
}
