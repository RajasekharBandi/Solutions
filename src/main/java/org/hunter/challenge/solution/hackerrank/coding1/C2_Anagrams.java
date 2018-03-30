package org.hunter.challenge.solution.hackerrank.coding1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Hunter on 28/03/2018.
 */
public class C2_Anagrams {
    public static int numberNeeded(String first, String second) {
        Map firstMap = strToMap(first);
        Map secondMap = strToMap(second);
        int sum = 0;

        for (Object m : firstMap.entrySet()) {
            Map.Entry entry = (Map.Entry) m;
            char key = (Character) entry.getKey();
            int value = (Integer) entry.getValue();
            if (secondMap.containsKey(key)) {
                int valueS = (Integer) secondMap.get(key);
                sum += Math.abs(value - valueS);
                secondMap.remove(key);
            } else {
                sum += value;
            }
        }

        for (Object values : secondMap.values()) {
            sum += (Integer) values;
        }

        return sum;
    }

    public static Map strToMap(String str) {
        Map map = new HashMap<Character, Integer>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, (Integer) map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }

        return map;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        String b = in.next();
//        System.out.println(numberNeeded(a, b));
        int[] lettercounts = new int[26];
        System.out.println(lettercounts[0]);
    }
}
