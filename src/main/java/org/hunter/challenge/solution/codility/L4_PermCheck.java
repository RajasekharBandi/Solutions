package org.hunter.challenge.solution.codility;

import java.util.Arrays;

/**
 * Created by Hunter on 31/03/2018.
 */
public class L4_PermCheck {
    public static int solution(int[] A){
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            if(A[i]!=i+1){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        int[] arr1={1,2,3,4};
        int[] arr2={1,3,4};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }
}
