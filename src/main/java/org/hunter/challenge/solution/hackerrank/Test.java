package org.hunter.challenge.solution.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Hunter on 29/03/2018.
 */
public class Test implements Comparator{
    public static void main(String[] args){
        Integer a=2;
        Integer b=1;
        Test t=new Test();



        System.out.println(a.compareTo(b));
        System.out.println(t.compare(a,b));


//        List list = new ArrayList<Integer>();
//        list.add(0,2);
//        list.add(0,1);
//
//        for(Object num:list){
//            System.out.println(num);
//        }
    }

    public int compare(Object o1, Object o2) {
        return 0;
    }
}
