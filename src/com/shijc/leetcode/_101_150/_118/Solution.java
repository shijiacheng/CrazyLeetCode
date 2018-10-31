package com.shijc.leetcode._101_150._118;

import java.util.ArrayList;
import java.util.List;

/**
 * 118.Pascal's Triangle
 * 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。 示例: 输入: 5 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        List<List<Integer>> result = solution.generate(5);
        System.out.println(result.toArray());
    }

    public List<List<Integer>> generate(int numRows) {
        if (numRows < 0) {
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> eachRow = new ArrayList<>();
            eachRow.add(1);
            for (int j = 1; j < i; j++) {
                if (i - 1 >= 0) {
                    List<Integer> lastRow = result.get(i - 1);
                    int num = lastRow.get(j - 1) + lastRow.get(j);
                    eachRow.add(j, num);
                }
            }
            if (i > 0) {
                eachRow.add(i, 1);
            }
            result.add(i, eachRow);
        }
        return result;

    }
}
