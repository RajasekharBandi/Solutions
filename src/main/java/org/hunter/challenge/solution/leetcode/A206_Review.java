package org.hunter.challenge.solution.leetcode;

/**
 * Created by Hunter on 5/04/2018.
 */


public class A206_Review {
    public static void main(String[] args) {
        System.out.println();
    }

    public ListNode reverseList(ListNode head) {

        ListNode cur=head;
        ListNode pre=null;
        while (cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }

        return pre;

    }
}
