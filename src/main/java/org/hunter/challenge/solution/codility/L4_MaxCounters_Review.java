package org.hunter.challenge.solution.codility;

/**
 * Created by Hunter on 31/03/2018.
 */
public class L4_MaxCounters_Review {
    public static int[] solution(int N, int[] A) {
        int[] res = new int[N];
        int max = 0;
        int preMax=0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                res[A[i] - 1]=Math.max(res[A[i] - 1],preMax);
                res[A[i] - 1] += 1;

                int curr = res[A[i] - 1];
                if (max < curr) {
                    max = curr;
                }
            } else {
                preMax=max;
//                res[0]=max;
//                res[A[i] - 1] += Math.max(res[A[i] - 1],max) +1 ;
//                for (int j = 0; j < N; j++) {
//                    res[j] = max;
//                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] arr={3,1,2,4,3};
        int[] arr = {3, 4, 4, 6, 1, 4, 4};
        int[] res = solution(5, arr);
        for (int re : res) {
            System.out.println(re);
        }

    }
}
