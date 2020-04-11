package com.LeetCodeThirtyDayChallenge.week2;

import java.util.Stack;

/**
 * @Author: Chandra sekhar Polavarapu
 * @Description : create a stack with push pop and top operations but get min. value of the stack in constant
 * time complexity.
 */
public class DayTenChallenge {
    /**
     * initialize your data structure here.
     */
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    /*public MinStack() {

    }*/

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) { //you have to stop operation if the stack is empty
            int poppedElement = stack.pop();
            if (poppedElement == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        if (!stack.isEmpty()) { //stop operation if the stack is empty. otherwise it throws exception
            return stack.peek();
        }
        return 0;
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            System.out.println("the minimum element is: " + minStack.peek());
            return minStack.peek();
        }
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
