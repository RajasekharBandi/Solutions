package org.hunter.challenge.solution.hackerrank.coding2;

import java.util.*;

/**
 * Created by Hunter on 31/03/2018.
 * When all the remaining sticks are the same length, they cannot be shortened so discard them.
 */
public class Day0_CutSticks {
    static int[] cutTheSticks(int[] arr) {
        // Complete this function
        List list = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
//            int min = Arrays.stream(arr).min().getAsInt();
            int min = getMin(arr);
            if (min > 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        arr[j] = arr[j] - min;
                        sum++;
                    }
                }
                list.add(sum);
            }
        }
        return list.stream().mapToInt(i -> (int) i).toArray();
    }

    static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && min > arr[i]) min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
