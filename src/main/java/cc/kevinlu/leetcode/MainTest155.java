package cc.kevinlu.leetcode;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Stack;

public class MainTest155 {
    public static void main(String[] args) {
       /* Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        Stack<Integer> stack2  = new Stack<>();
        stack2 = stack1;
        stack2.pop();
        stack2.pop();*/

        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        int c = minStack.top();
        int min = minStack.getMin();
        int d = minStack.top();
    }
}
class MinStack {
    Stack<Integer> minStack;
    public MinStack() {
        minStack = new Stack<>();
    }

    public void push(int x) {
        minStack.push(x);
    }

    public void pop() {
        minStack.pop();
    }

    public int top() {
        return minStack.peek();

    }

    public int getMin() {
        Object[] tempList = new Object[minStack.size()];
        minStack.copyInto(tempList);
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i < tempList.length; i++){
            temp = Math.min(temp, (Integer) tempList[i]);
        }
        return temp;
    }
}