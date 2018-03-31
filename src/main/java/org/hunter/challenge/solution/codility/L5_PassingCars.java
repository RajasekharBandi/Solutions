package org.hunter.challenge.solution.codility;

/**
 * Created by Hunter on 1/04/2018.
 */
public class L5_PassingCars {
    public static int solution(int[] A) {
        int mul = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                mul++;
            } else {
                sum = sum + mul;
            }

            if (sum > 1000000000) {
                return -1;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[] arr1={0,1,0,1,1};
        int[] arr2={1,3,4};
        System.out.println(solution(arr1));
//        System.out.println(solution(arr2));
    }
}
