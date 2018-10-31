package com.shijc.leetcode._101_150._119;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 * 杨辉三角 II
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 示例: 输入: 3 输出: [1,3,3,1]
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> result = solution.getRow(4);
        System.out.println(result.toString());
    }

    public List<Integer> getRow(int rowIndex) {

        if (rowIndex < 0) {
            return null;
        }
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = result.size() - 2; j >= 0; j--) {
                result.set(j + 1, result.get(j) + result.get(j + 1));
            }
            result.add(1);
        }

        return result;

    }

}
