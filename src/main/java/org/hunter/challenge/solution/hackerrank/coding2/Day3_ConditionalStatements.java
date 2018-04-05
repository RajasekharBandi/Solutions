package org.hunter.challenge.solution.hackerrank.coding2;

import java.util.Scanner;

/**
 * Created by Hunter on 5/04/2018.
 */


public class Day3_ConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else{
            if(n<6){
                ans = "Not Weird";
            }else if(n<21) {
                ans = "Weird";
            }else {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }

    public static int solution(int[] arr) {
        System.out.println();

        return 0;
    }
}
