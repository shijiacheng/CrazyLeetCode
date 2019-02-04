package com.shijc.leetcode._801_850._844;

import java.util.Stack;

/**
 * 844. 比较含退格的字符串
 * backspace string compare
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 *
 *
 *
 * 示例 1：
 *
 * 输入：S = "ab#c", T = "ad#c"
 * 输出：true
 * 解释：S 和 T 都会变成 “ac”。
 * 示例 2：
 *
 * 输入：S = "ab##", T = "c#d#"
 * 输出：true
 * 解释：S 和 T 都会变成 “”。
 * 示例 3：
 *
 * 输入：S = "a##c", T = "#a#c"
 * 输出：true
 * 解释：S 和 T 都会变成 “c”。
 * 示例 4：
 *
 * 输入：S = "a#c", T = "b"
 * 输出：false
 * 解释：S 会变成 “c”，但 T 仍然是 “b”。
 */
public class Solution {

    public boolean backspaceCompare(String S, String T) {
        String s1 = getLastString(S);
        String t1 = getLastString(T);

        return s1.equals(t1);
    }

    private String getLastString(String str){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == '#'){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.push(str.charAt(i));
            }
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
