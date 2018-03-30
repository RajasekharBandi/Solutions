package org.hunter.challenge.solution.hackerrank.coding2;

import java.util.Scanner;

/**
 * Created by Hunter on 31/03/2018.
 */
public class Day1_DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int in=scan.nextInt();
        double dou=scan.nextDouble();
        scan.nextLine();
        String str= scan.nextLine();

        System.out.println(i+ in);
        System.out.println(d+ dou);
        System.out.println(s+ str);
    }
}
