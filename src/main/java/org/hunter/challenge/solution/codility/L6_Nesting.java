package org.hunter.challenge.solution.codility;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Hunter on 1/04/2018.
 */
public class L6_Nesting {
    public static int solution(String expression) {
        if (expression.isEmpty()) return 1;
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        Stack<Character> stack = new Stack();
        for (char c : expression.toCharArray()) {
            if (map.containsKey(c) && !stack.isEmpty()) {
                char stackChar = stack.pop();
                if (stackChar != map.get(c)) {
                    return 0;
                }
            } else {
                stack.push(c);
            }
        }
        if (!stack.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
