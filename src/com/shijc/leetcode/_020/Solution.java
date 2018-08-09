package com.shijc.leetcode._020;

import java.util.Stack;

/**
 * 20. Valid ParentTheses
 * 有效的括号
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * 示例 1:
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 */
public class Solution {
    /**
     * 用压栈弹栈的方式来实现
     */
    public boolean isValid(String s) {
        if (s == null || s.length() == 0){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '('){
                stack.push(')');
            }
            else if (chars[i] == '['){
                stack.push(']');
            }
            else if (chars[i] == '{'){
                stack.push('}');
            }
            else if (stack.isEmpty() || chars[i] != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isValid(""));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("{[]}"));
    }
}
