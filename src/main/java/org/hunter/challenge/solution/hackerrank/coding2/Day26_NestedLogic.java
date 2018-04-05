package org.hunter.challenge.solution.hackerrank.coding2;

import java.util.Scanner;

/**
 * Created by Hunter on 5/04/2018.
 */


public class Day26_NestedLogic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int actualDay = in.nextInt();
        int actualMonth = in.nextInt();
        int actualYear = in.nextInt();

        int expectDay = in.nextInt();
        int expectMonth = in.nextInt();
        int expectYear = in.nextInt();
        in.close();
        if (actualYear <= expectYear) {
            if (actualMonth == expectMonth) {
                if (actualDay > expectDay) {
                    System.out.println((actualDay - expectDay) * 15);
                } else {
                    System.out.println(0);
                }
            } else if(actualMonth < expectMonth){
                System.out.println(0);
            }else {
                System.out.println((actualMonth - expectMonth) * 500);
            }

        } else {
            System.out.println(10000);
        }


    }

    public static int solution(int[] arr) {
        System.out.println();

        return 0;
    }
}
