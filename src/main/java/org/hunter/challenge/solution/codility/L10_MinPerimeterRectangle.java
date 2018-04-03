package org.hunter.challenge.solution.codility;

/**
 * Created by Hunter on 1/04/2018.
 * 92%
 */
public class L10_MinPerimeterRectangle {
    public int solution(int N){
        int i=1;
        int min=Integer.MAX_VALUE;
        while (i*i<N){
            if(N%i==0){
                int other=N/i;
                min=Math.min(min,2*(i+other));
            }
            i+=1;
        }
        if(i*i==N){
            min=Math.min(min,2*(i+i));
        }
        return min;
    }
}
