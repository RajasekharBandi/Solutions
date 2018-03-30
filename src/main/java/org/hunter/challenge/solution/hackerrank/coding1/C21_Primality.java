package org.hunter.challenge.solution.hackerrank.coding1;

import java.util.Scanner;

/**
 * Created by Hunter on 30/03/2018.
 */
public class C21_Primality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            System.out.println(isPrime(n));
        }
    }

    public static String isPrime(int num){
        if(num==1) return "Not prime";
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return "Not prime";
            }
        }
        return "Prime";
    }
}
