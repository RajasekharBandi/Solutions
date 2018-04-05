package org.hunter.challenge.solution.codility;

/**
 * Created by Hunter on 31/03/2018.
 */
public class Test2 {
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

}
