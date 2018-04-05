package org.hunter.challenge.solution.codility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Hunter on 31/03/2018.
 */
public class Test1 {
    public static void main(String[] args) {
        int n=6;
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        System.out.println(arr[n]);
    }

    public static int fibo(int n){
        if(n<=1){
            return n;
        }else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
