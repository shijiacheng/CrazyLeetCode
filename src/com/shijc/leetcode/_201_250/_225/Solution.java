package com.shijc.leetcode._201_250._225;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 225. 用队列实现栈
	题目描述提示帮助提交记录社区讨论阅读解答
	使用队列实现栈的下列操作：
	push(x) -- 元素 x 入栈
	pop() -- 移除栈顶元素
	top() -- 获取栈顶元素
	empty() -- 返回栈是否为空
	
 * @author shijiacheng
 */
public class Solution {
	public static void main(String[] args) {
		
	}

}

class MyStack {
	
	Queue<Integer> queue1 = new ArrayDeque<>();
	Queue<Integer> queue2 = new ArrayDeque<>();

    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	while(!queue1.isEmpty()) {
    		queue2.offer(queue1.poll());
    	}
    	queue1.offer(x);
    	while(!queue2.isEmpty()) {
    		queue1.offer(queue2.poll());
    	}
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	if(queue1.isEmpty()) {
    		return 0;
    	}
        return queue1.poll();
    }
    
    /** Get the top element. */
    public int top() {
    	if(queue1.isEmpty()) {
    		return 0;
    	}
        return queue1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}
