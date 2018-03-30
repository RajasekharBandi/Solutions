package org.hunter.challenge.solution.hackerrank.coding1;

import java.util.Scanner;

/**
 * Created by Hunter on 30/03/2018.
 */
public class C22_Fibonacci {
    public static int fibonacci(int n) {
        // Complete the function.
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
