package org.hunter.challenge.solution.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hunter on 5/04/2018.
 */


public class L15_AbsDistinct {
    public static void main(String[] args) {
        int[] arr={};
        System.out.println();
    }

    public static int solution(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(Math.abs(arr[i]));
        }

        return set.size();
    }
}
