package org.hunter.challenge.solution.hackerrank.coding1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Hunter on 28/03/2018.
 */
public class C3_RansomNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            ransom[ransom_i] = in.next();
        }

        System.out.println(numberNeeded(magazine,ransom));
    }


    public static String numberNeeded(String[] first, String[] second) {
        Map firstMap = strToMap(first);
        Map secondMap = strToMap(second);

        for (Object m : secondMap.entrySet()) {
            Map.Entry entry = (Map.Entry) m;
            String key = (String) entry.getKey();
            int value = (Integer) entry.getValue();
            if (!firstMap.containsKey(key) || (Integer) firstMap.get(key) < value) {
                return "No";
            }
        }

        return "Yes";
    }

    public static Map strToMap(String[] line) {
        Map map = new HashMap<String, Integer>();
        for (String word : line) {
            if (map.containsKey(word)) {
                map.put(word, (Integer) map.get(word) + 1);
            } else {
                map.put(word, 1);
            }

        }

        return map;
    }
}
