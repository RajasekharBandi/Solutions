package org.hunter.challenge.solution.hackerrank.coding2;

import java.util.Scanner;

/**
 * Created by Hunter on 5/04/2018.
 */


public class Day9_Recursion {
    static int factorial(int n) {
        // Complete this function
        if(n<=1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
