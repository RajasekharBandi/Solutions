package org.hunter.challenge.solution.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hunter on 15/03/2018.
 */
public class A141 {
    public boolean hasCycle(ListNode head) {
        Set set = new HashSet<ListNode>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        try {
            while (head != null) {
                head = head.next;
            }
            return false;
        } catch (Exception e) {
            return true;
        }
    }
}
