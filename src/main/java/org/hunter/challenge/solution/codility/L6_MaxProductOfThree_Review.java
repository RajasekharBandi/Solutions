package org.hunter.challenge.solution.codility;

import java.util.Arrays;

/**
 * Created by Hunter on 1/04/2018.
 */
public class L6_MaxProductOfThree_Review {
    public int solution(int[] A){
        Arrays.sort(A);
        int N = A.length;
        return Math.max(A[N - 3] * A[N - 2] * A[N - 1], A[0] * A[1] * A[N - 1]);
    }
}
