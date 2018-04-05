package org.hunter.challenge.solution.hackerrank.coding2;

import java.util.*;

/**
 * Created by Hunter on 5/04/2018.
 */


public class Day18_Queues {
    Stack<Character> stack = new Stack<>();
    Queue<Character> queue=new LinkedList<>();

    void pushCharacter(char ch){
        stack.push(ch);
    }

    void enqueueCharacter(char ch){
        queue.add(ch);
    }

    char popCharacter(){
        return stack.pop();
    }

    char dequeueCharacter(){
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18_Queues p = new Day18_Queues();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
