package cc.kevinlu.leetcode;

import java.util.Stack;

public class MainTest232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
    }
}
class MyQueue {
    Stack<Integer> inPutStack;
    Stack<Integer> outPutStack;
    /** Initialize your data structure here. */
    public MyQueue() {
        inPutStack = new Stack<>();
        outPutStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
       while (!outPutStack.isEmpty()){
           inPutStack.add(outPutStack.pop());
       }
        inPutStack.add(x);
       while(!inPutStack.isEmpty()){
           outPutStack.add(inPutStack.pop());
       }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return outPutStack.pop();

    }

    /** Get the front element. */
    public int peek() {
        return outPutStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return outPutStack.isEmpty() ? true : false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */