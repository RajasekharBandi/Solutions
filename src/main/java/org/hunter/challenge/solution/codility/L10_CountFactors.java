package org.hunter.challenge.solution.codility;

/**
 * Created by Hunter on 1/04/2018.
 * 92%
 */
public class L10_CountFactors {
    public int solution(int N){
        int i=1;
        int res=0;
        while (i*i<N){
            if(N%i==0){
                res +=2;
            }
            i+=1;
        }
        if(i*i==N){
            res++;
        }
        return res;
    }
}
