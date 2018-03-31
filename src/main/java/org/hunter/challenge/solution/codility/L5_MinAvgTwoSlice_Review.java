package org.hunter.challenge.solution.codility;

/**
 * Created by Hunter on 1/04/2018.
 */
public class L5_MinAvgTwoSlice_Review {
    public static int solution(int[] A) {
        double sum = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < A.length - 1; i++) {
            double sumPre = A[i];
            for (int j = i + 1; j < A.length; j++) {
                double sumCur = (sumPre + A[j]) / (double) (j - i + 1);
                if (sum > sumCur) {
                    sum=sumCur;
                    index = i;
                }
                sumPre = sumPre + A[j];
            }
        }
        return index;
    }

    public static void main(String[] args) {
//        int[] arr={3,1,2,4,3};
//        int[] arr = {4, 2, 2, 3, 5, 1, 5, 8};
        int[] arr = {5,6,3,4,9};
        System.out.println(solution(arr));
    }
}
