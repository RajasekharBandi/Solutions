package org.hunter.challenge.solution.hackerrank.coding2;

import java.util.Scanner;

/**
 * Created by Hunter on 5/04/2018.
 */


public class Day2_Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();

        double tip=meal_cost*tip_percent/100;
        double tax=meal_cost*tax_percent/100;

        int total=(int) Math.round(meal_cost + tip + tax);

        System.out.println("The total meal cost is "+total+" dollars.");
    }


    public static void solution(int num) {
        System.out.println();
    }
}
