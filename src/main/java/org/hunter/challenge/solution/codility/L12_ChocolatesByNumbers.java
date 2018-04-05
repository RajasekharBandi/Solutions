package org.hunter.challenge.solution.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hunter on 5/04/2018.
 */


public class L12_ChocolatesByNumbers {
    public static void main(String[] args) {
        System.out.println(solution(10,4));
    }

    public static int solution(int N, int M) {
        Set<Integer> set = new HashSet<>();
        int i=0;
        while (!set.contains(i)){
            set.add(i);
            i= (i+M)%N;
        }
        return set.size();
    }
}
