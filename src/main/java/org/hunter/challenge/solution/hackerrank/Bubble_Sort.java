package org.hunter.challenge.solution.hackerrank;

import java.util.Scanner;

/**
 * Created by Hunter on 16/03/2018.
 */
public class Bubble_Sort {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        String line = in.nextLine();
        String[] arrStr = line.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(arrStr[i]);
        }

        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }

        }

        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[n - 1]);

    }
}
