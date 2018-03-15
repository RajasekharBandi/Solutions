package org.hunter.challenge.solution.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hunter on 15/03/2018.
 */
public class A160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set set = new HashSet<ListNode>();
        ListNode copyA = headA;
        ListNode copyB = headB;

        while (copyA != null) {
            set.add(copyA);
            copyA = copyA.next;
        }

        while (copyB != null) {
            if (set.contains(copyB)) {
                return copyB;
            } else {
                copyB = copyB.next;
            }
        }
        return null;

    }

}
