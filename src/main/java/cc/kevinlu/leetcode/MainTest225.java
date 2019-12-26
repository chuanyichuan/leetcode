package cc.kevinlu.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MainTest225 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        //myStack.push(3);
        myStack.pop();
       // myStack.pop();
        //myStack.pop();
        myStack.top();
        myStack.empty();
    }
}

class MyStack {
    Queue<Integer> queue;
    int top;
/** Initialize your data structure here. */

    public MyStack() {
        queue = new LinkedList<>();
    }


/** Push element x onto stack. */

    public void push(int x) {
        top = x;
        queue.add(x);
    }


/** Removes the element on top of the stack and returns that element. */

    public int pop() {
        int oldTop = top;
        Queue<Integer> temp = new LinkedList<>();
        for(int i = 0; i < queue.size() - 1; i++) {
            int tempNode = queue.poll();
            temp.add(tempNode);
        }
        queue = temp;
        return oldTop;

    }


/** Get the top element. */

    public int top() {
        return top;
    }


/** Returns whether the stack is empty. */

    public boolean empty() {
        return queue.isEmpty() ? true : false;
    }
}
