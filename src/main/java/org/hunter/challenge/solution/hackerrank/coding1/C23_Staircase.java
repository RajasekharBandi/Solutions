package org.hunter.challenge.solution.hackerrank.coding1;

import java.util.Scanner;

/**
 * Created by Hunter on 16/03/2018.
 */
public class C23_Staircase {
    public static void main(String[] args) {
        //1,2,3 ===> 4

        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(process(n));
        }
    }

    public static int process(int n){
        if(n<=3){
            return 4;
        }else {

        }

        return 0;
    }
}
