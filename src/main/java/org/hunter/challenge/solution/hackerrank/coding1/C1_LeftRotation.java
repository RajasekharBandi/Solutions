package org.hunter.challenge.solution.hackerrank.coding1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Hunter on 28/03/2018.
 */
public class C1_LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        for(int i=k;i<a.length;i++){

            System.out.print(a[i]+" ");
        }

        for(int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
    }
}
