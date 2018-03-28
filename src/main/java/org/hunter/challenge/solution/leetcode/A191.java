package org.hunter.challenge.solution.leetcode;

/**
 * Created by Hunter on 16/03/2018.
 */
public class A191 {
    public static int hammingWeight(int n) {
//        long l =n & 0x00000000ffffffffL;
//        String str=Long.toBinaryString(l);
//        char[] ch=str.toCharArray();
//        int count=0;
//        for(char c:ch){
//            if(c=='1'){
//                count++;
//            }
//        }
//        return count;



        String str=Integer.toBinaryString(n);
        char[] ch=str.toCharArray();
        int count=0;
        for(char c:ch){
            if(c=='1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(10));
    }
}
