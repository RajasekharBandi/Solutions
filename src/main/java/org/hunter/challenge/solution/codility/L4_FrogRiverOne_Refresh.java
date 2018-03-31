package org.hunter.challenge.solution.codility;

import scala.Int;

import java.util.*;

/**
 * Created by Hunter on 31/03/2018.
 * original from https://github.com/charles-wangkai/codility/blob/master/FrogRiverOne.java
 * solution1
 * 100%
 * solution2
 * 54%
 */
public class L4_FrogRiverOne_Refresh {
    public int solution(int X, int[] A){
        boolean[] arr=new boolean[X+1];
        int remain=X;
        for(int i=0;i<A.length;i++){
            if(arr[A[i]]==false){
                arr[A[i]]=true;
                remain--;
                if(remain==0){
                    return i;
                }
            }
        }
        return -1;
    }

    public int solution2(int X, int[] A) {
        Set<Integer> set = new HashSet();
        int max= 0;

        for (int j = 1; j <= X; j++) {
            for (int i = 0; i < A.length; i++) {
                if(j==A[i]){
                    if(max < i){
                        max=i;
                    }
                    i=A.length;
                    set.add(j);
                }
            }
            if(!set.contains(j)){
                return -1;
            }
        }
        return max;
    }
}
