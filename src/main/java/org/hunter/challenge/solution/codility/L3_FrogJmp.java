package org.hunter.challenge.solution.codility;

/**
 * Created by Hunter on 31/03/2018.
 * 100%
 */
public class L3_FrogJmp {
    public static int solution(int X, int Y, int D){
        int jmp= (int) Math.ceil((double) (Y-X) / ((double)D));
        return jmp;
    }

    public static void main(String[] args){
        System.out.println(solution(10,85,30));
    }
}
