package org.hunter.challenge.solution.hackerrank.coding1;

import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by Hunter on 29/03/2018.
 */
public class C8_RunningMedian_NotSure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        List list = new ArrayList();

        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
//            System.out.println(process(convertObjToArr(sal)));
//            System.out.println(process(a,a_i+1));
            int low = 0;
            int high = a_i;
            int mid = 0;

            while (low <= high) {
                mid = (low + high) / 2;
                int midVal = a[mid];

                if (midVal < a[a_i]) {
                    low = mid + 1;
                } else{
                    high = mid - 1;
                }
            }
            System.out.println(mid);

//            while (first < last) {
//                int mid = (first + last) / 2;
//                if (a[mid] >= a[a_i]) {
//                    last = mid-1;
//                } else {
//                    first = mid+1;
//                }
//                System.out.println(mid);
//            }
        }
    }


    public static String process(List list) {
        PriorityQueue pq = new PriorityQueue();

        int len = list.size();
        int index = len / 2;
        double res = 0.0;
        if (len % 2 == 0) {
            res = ((Double) list.get(index) + (Double) list.get(index - 1)) / 2;
        } else {
            res = (Double) list.get(index);
        }

        DecimalFormat df = new DecimalFormat("0.0");
        return df.format(res);
    }

}
