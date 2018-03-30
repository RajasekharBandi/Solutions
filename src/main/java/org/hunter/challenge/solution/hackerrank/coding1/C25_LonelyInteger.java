package org.hunter.challenge.solution.hackerrank.coding1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Hunter on 16/03/2018.
 */
public class C25_LonelyInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }


        Set set = new HashSet<Integer>();
        for (int num : a) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        Iterator it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
