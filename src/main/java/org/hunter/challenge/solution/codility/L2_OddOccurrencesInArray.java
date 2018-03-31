package org.hunter.challenge.solution.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hunter on 31/03/2018.
 * 100%
 */
public class L2_OddOccurrencesInArray {
    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            boolean b = set.contains(a) ? set.remove(a) : set.add(a);
        }
        return set.iterator().next();
    }

    public static void main(String[] args){
        int[] arr={9,3,9,3,7};
        System.out.println(solution(arr));
    }
}
