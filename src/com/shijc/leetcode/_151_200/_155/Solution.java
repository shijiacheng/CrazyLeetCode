package com.shijc.leetcode._151_200._155;

import java.util.Stack;

/**
 * 155. 最小栈
	设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
	push(x) -- 将元素 x 推入栈中。
	pop() -- 删除栈顶的元素。
	top() -- 获取栈顶元素。
	getMin() -- 检索栈中的最小元素。
	示例:
	MinStack minStack = new MinStack();
	minStack.push(-2);
	minStack.push(0);
	minStack.push(-3);
	minStack.getMin();   --> 返回 -3.
	minStack.pop();
	minStack.top();      --> 返回 0.
	minStack.getMin();   --> 返回 -2.
 * 
 * @author shijiacheng
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		
	}

}
class MinStack {
	
	Stack<Integer> stacks = new Stack<>();
	Stack<Integer> min_stacks = new Stack();

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
    	stacks.push(x);
    	if(min_stacks.empty() || min_stacks.peek() > x) {
    		min_stacks.push(x);
    	}else {
    		min_stacks.push(min_stacks.peek());
    	}
    }
    
    public void pop() {
        if(stacks.empty() || min_stacks.empty()) {
        	return;
        }
        
        stacks.pop();
        min_stacks.pop();
    }
    
    public int top() {
        if(!stacks.empty()) {
        	return stacks.peek();
        }
        return 0;
    }
    
    public int getMin() {
    	if(!min_stacks.empty()) {
        	return min_stacks.peek();
        }
        return 0;
    }
}