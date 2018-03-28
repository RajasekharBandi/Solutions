package org.hunter.challenge.solution.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Hunter on 28/03/2018.
 */
public class C5_BalancedBrackets {
    public static boolean isBalanced(String expression) {
        Map map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack stack = new Stack();
        for (char c : expression.toCharArray()) {
            if (map.containsKey(c) && !stack.isEmpty()) {
                char stackChar = (Character) stack.pop();
                if (stackChar != (Character)map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}
