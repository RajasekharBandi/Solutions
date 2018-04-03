package org.hunter.challenge.solution.codility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hunter on 1/04/2018.
 * 100%
 */
public class L8_Dominator {
    public int solution(int[] A){
        if(A.length==0) return -1;
        if(A.length==1) return 0;
        Map<Integer,Integer> map=new HashMap<>();
        int half=(int) Math.ceil(A.length/2);
        for(int i=0;i<A.length;i++){
            int cur=A[i];
            int occ=1;
            if(map.containsKey(cur)){
                occ=map.get(cur);
                occ++;
                if(occ>half){
                    return i;
                }
            }
            map.put(cur,occ);
        }

        return -1;
    }
}
