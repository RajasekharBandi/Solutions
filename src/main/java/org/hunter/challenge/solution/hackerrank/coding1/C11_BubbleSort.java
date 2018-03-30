package org.hunter.challenge.solution.hackerrank.coding1;

import java.util.Scanner;

/**
 * Created by Hunter on 30/03/2018.
 */
public class C11_BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int step=0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i -1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    step++;
                }
            }

        }

        System.out.println("Array is sorted in "+step+" swaps.");
        System.out.println("First Element: "+ a[0]);
        System.out.println("Last  Element: "+ a[a.length-1]);
    }

}
