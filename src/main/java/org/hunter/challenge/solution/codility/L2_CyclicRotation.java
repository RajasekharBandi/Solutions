package org.hunter.challenge.solution.codility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hunter on 31/03/2018.
 * 100%
 */
public class L2_CyclicRotation {
    public int[] solution(int[] A, int K){
        K=K%A.length;
        K=A.length-K;
        List<Integer> list=new ArrayList();
        for(int i=K;i<A.length;i++){
            list.add(A[i]);
        }

        for(int i=0;i<K;i++){
            list.add(A[i]);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
