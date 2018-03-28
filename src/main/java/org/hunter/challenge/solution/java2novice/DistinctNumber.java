package org.hunter.challenge.solution.java2novice;

/**
 * Created by Hunter on 28/03/2018.
 */
public class DistinctNumber {
    public static void main(String[] args){
        int[] nums={5,2,7,2,9,10,5,13};

        distinct(nums);

    }

    public static void distinct(int[] a){
        for(int i=0;i<a.length;i++){
            boolean isDis=false;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    isDis=true;
                    break;

                }
            }
            if(!isDis){
                System.out.print(a[i]+" ");
            }
        }
    }
}
