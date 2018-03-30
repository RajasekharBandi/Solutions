package org.hunter.challenge.solution.hackerrank.coding1;

import java.util.Stack;

/**
 * Created by Hunter on 29/03/2018.
 */
public class MyQueue<T> {
    Stack<T> stackIn = new Stack<T>();
    private int cur = 0;

    public void enqueue(T t) {
        stackIn.push(t);
    }

    public void dequeue() {
        cur++;
    }

    public T peek() {
        return stackIn.get(cur);
    }

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

//        Stack stack = new Stack();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.add(0,"A");
//        stack.add(1,"B");

//        System.out.println((String) stack.peek());
//        System.out.println((String) stack.firstElement());
//        System.out.println((String) stack.elementAt(0));

        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue.peek());
    }

}
