package org.hunter.challenge.solution.codility;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Hunter on 31/03/2018.
 * 100%
 */
public class L1_BinaryGap {
    public static void main(String[] args){
//        System.out.println(solution(529));
        System.out.println(solution(1041));
        System.out.println(solution(15));
        //        System.out.println(binaryString);
    }

    public static int solution(int N){
        String binaryString=Integer.toBinaryString(N);
        String bsStrip=binaryString.substring(0,binaryString.lastIndexOf("1"));
        String[] bsStrArr=bsStrip.split("1");
        int count=0;
        if(bsStrArr.length!=0){
            count =Arrays.stream(bsStrArr).mapToInt(i->i.length()).max().getAsInt();
        }
        return count;
    }

}
