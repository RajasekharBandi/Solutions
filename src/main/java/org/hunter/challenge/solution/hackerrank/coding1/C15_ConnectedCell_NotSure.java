package org.hunter.challenge.solution.hackerrank.coding1;

import java.util.Scanner;

/**
 * Created by Hunter on 30/03/2018.
 */
public class C15_ConnectedCell_NotSure {
    public static int getBiggestRegion(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){

            }
        }
        return 1;

    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}
