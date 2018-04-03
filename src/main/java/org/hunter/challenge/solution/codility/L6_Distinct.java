package org.hunter.challenge.solution.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hunter on 1/04/2018.
 */
public class L6_Distinct {
    public int solution(int[] A){
        Set<Integer> set = new HashSet<>();
        for(int a:A){
            set.add(a);
        }

        return set.size();
    }
}
