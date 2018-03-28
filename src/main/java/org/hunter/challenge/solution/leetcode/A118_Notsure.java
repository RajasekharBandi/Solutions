package org.hunter.challenge.solution.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hunter on 16/03/2018.
 */
public class A118_Notsure {
    public List<List<Integer>> generate3(int numRows) {

        List list = new ArrayList<List<Integer>>();
        List row = new ArrayList<Integer>();
        if (numRows == 0) {
            list.add(row);
            return list;
        } else if (numRows == 1) {
            row.add(1);
            list.add(row);
            return list;
        } else if (numRows == 2) {
            row.add(1);
            list.add(row);
            row.clear();
            row.add(1);
            row.add(1);
            list.add(row);
            return list;
        } else {
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < i; j++) {
                    List rowInner = new ArrayList<Integer>();
                    if (j == 0 || j == i - 1) {
                        rowInner.add(1);
                    } else {
                        int[][] arr = (int[][]) list.toArray();
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                        rowInner.add(arr[i][j]);
                    }
                    list.add(row);
                }
            }
            return list;
        }
    }


    public static int[][] generate2(int numRows) {
        //
        int[][] arr = new int[numRows][numRows];
        arr[0][0]=1;
        arr[1][0]=1;
        arr[1][1]=1;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
//
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }

        return arr;
    }

//    public static List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> list = new ArrayList<List<Integer>>();
//        List row = new ArrayList<Integer>();
//        if (numRows == 0) {
//            return list;
//        } else if (numRows == 1) {
//            row.add(1);
//            list.add(row);
//            return list;
//        } else if (numRows == 2) {
//            row.add(1);
//            list.add(row);
////            row.clear();
//            row = new ArrayList<Integer>();
//            row.add(1);
//            row.add(1);
//            list.add(row);
//            return list;
//        } else {
//            for (int i = 0; i < numRows; i++) {
//                List rowInner = new ArrayList<Integer>();
//                for (int j = 0; j < i; j++) {
//                    rowInner.add()
//                    rowInner.add(arr[i][j]);
//                }
//                list.add(rowInner);
//            }
//        }
//        return list;
//    }

    public static void main(String[] args){
        List list=new ArrayList<Integer>();

//        System.out.println(list.get(2));
//        System.out.println(generate(3));
    }


    public static List<List<Integer>> generate4(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        // First base case; if user requests zero rows, they get zero rows.
        if (numRows == 0) {
            return triangle;
        }

        // Second base case; first row is always [1].
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prevRow = triangle.get(rowNum-1);

            // The first row element is always 1.
            row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            // The last row element is always 1.
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
}
