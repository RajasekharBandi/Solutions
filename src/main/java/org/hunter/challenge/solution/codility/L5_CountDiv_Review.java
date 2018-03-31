package org.hunter.challenge.solution.codility;

/**
 * Created by Hunter on 31/03/2018.
 * 25%
 */
public class L5_CountDiv_Review {
    public int solution(int A, int B, int K){
       return (int) Math.ceil((double) (B-A)/(double) K);
    }
}
