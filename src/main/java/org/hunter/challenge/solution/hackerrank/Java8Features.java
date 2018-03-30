package org.hunter.challenge.solution.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by Hunter on 31/03/2018.
 */
public class Java8Features {
    public static void main(String[] args) {
        feature2();

        System.out.println("");
    }

    public static void feature1(){
        List list=new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.forEach( i -> System.out.println(i));
    }

    public static void feature2(){
        List list=new ArrayList<Integer>();
        for(int i=0;i<100;i++) list.add(i);
        Stream stream=list.stream();
        Stream parallel=list.parallelStream();

        stream.filter(i->(int)i>90).forEach(i->System.out.println("sequ "+i));
        parallel.filter(i->(int)i>90).forEach(i->System.out.println("para "+i));
    }
}

interface inter{
    default void test(){

    }
}
