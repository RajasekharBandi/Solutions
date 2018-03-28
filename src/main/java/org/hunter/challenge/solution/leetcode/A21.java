package org.hunter.challenge.solution.leetcode;

/**
 * Created by Hunter on 16/03/2018.
 */
public class A21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode lnew = new ListNode(0);
        ListNode lnext = lnew;

        while (l1 != null && l2 != null) {
            int val1 = l1.val;
            int val2 = l2.val;

            if (val1 < val2) {
                lnext.next = l1;
                l1 = l1.next;
            } else {
                lnext.next = l2;
                l2 = l2.next;
            }
            lnext = lnext.next;
        }

        if (l1 == null) {
            lnew.next = l2;
        }

        if (l2 == null) {
            lnew.next = l1;
        }

        return lnew;
    }
}
