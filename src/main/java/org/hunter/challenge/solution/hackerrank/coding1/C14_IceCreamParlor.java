package org.hunter.challenge.solution.hackerrank.coding1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Hunter on 30/03/2018.
 */
public class C14_IceCreamParlor {
    static void solve(int[] arr, int money) {
        // Complete this function
        Map map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            int remain=money-arr[i];
            if(map.containsKey(remain)){
                int index=(Integer) map.get(remain);
                if(i!=index){
                    System.out.println((index+1)+" "+(i+1));
                    break;
                }
            }else {
                map.put(arr[i],i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();//trips
        for(int a0 = 0; a0 < t; a0++){
            int money = in.nextInt();//total money
            int n = in.nextInt();//available flavors
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            solve(arr, money);
        }
        in.close();
    }
}
