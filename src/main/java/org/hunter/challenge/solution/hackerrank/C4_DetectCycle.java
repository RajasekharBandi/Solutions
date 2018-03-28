package org.hunter.challenge.solution.hackerrank;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hunter on 28/03/2018.
 */
public class C4_DetectCycle {
    static boolean hasCycle2(Node head) {
        if (head == null) return false;
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            if (fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }


    static boolean hasCycle(Node head) {
        Set set = new HashSet<Node>();
        Node curr = head;
        while (curr != null) {
            if (set.contains(curr)) {
                return true;
            } else {
                set.add(curr);
            }
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node();
//        Node n1=new Node();
//        Node n2=new Node();
//        head.next=n1;
//        n1.next=n2;
//        n2.next=head;

        System.out.println(hasCycle(head));
    }
}
