package org.hunter.challenge.solution.codility;

/**
 * Created by Hunter on 1/04/2018.
 */
public class L9_MaxDoubleSliceSum {
    public static int solution(int[] A) {
        int max_ending=0;
        int max_slice=0;
        for(int a:A){
            max_ending=Math.max(0,max_ending+a);
            max_slice=Math.max(max_slice,max_ending);

            System.out.println("max_ending: " + max_ending +" max_slice: "+ max_slice);
        }

        return max_slice;
    }

    public static void main(String[] args) {
//        int[] arr={3,1,2,4,3};
        int[] arr = {4, 2, 2, 3, 5, 1, 5, 8};
//        int[] arr = {-1,-2,-3,-4};
        System.out.println(solution(arr));
    }
}
