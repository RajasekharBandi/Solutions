package org.hunter.challenge.solution.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hunter on 31/03/2018.
 * 100%
 */
public class L4_MissingInteger {
    public int solution(int[] A){
        Set<Integer> set = new HashSet<>();
        for(int a:A){
            set.add(a);
        }
        int i=1;
        while (set.contains(i)){
            i++;
        }
        return i;
    }
}
