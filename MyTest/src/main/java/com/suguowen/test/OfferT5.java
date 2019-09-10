package com.suguowen.test;

import java.util.Stack;

public class OfferT5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.empty()){
            throw new IllegalStateException("两个栈都为空");
        }
        return stack2.pop();
    }
}
