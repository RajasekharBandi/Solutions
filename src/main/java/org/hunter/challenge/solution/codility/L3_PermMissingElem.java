package org.hunter.challenge.solution.codility;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Hunter on 31/03/2018.
 * 100%
 */
public class L3_PermMissingElem {
    public static int solution(int[] A){
        int sumAll=0;
        int sumMiss=0;
        for(int i=0;i<A.length;i++){
            sumAll=sumAll+i;
            sumMiss=sumMiss + A[i];
        }
        sumAll=sumAll+A.length+A.length+1;
        return sumAll-sumMiss;
    }

    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,3,4,5,6};
        int[] arr3={1,2,3,4,6};
        int[] arr4={1,2,4,5,6};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
        System.out.println(solution(arr4));
    }
}
