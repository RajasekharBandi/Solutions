package org.hunter.challenge.solution.hackerrank.coding2;

import java.util.Scanner;

/**
 * Created by Hunter on 5/04/2018.
 */

public class Day11_2DArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
    }
}
