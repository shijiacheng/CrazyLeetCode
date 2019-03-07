package com.shijc.leetcode._551_600._575;

import java.util.HashSet;
import java.util.Set;

/**
 * 575. 分糖果
 * distribute candies
 * 给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的种类数。
 *
 * 示例 1:
 *
 * 输入: candies = [1,1,2,2,3,3]
 * 输出: 3
 * 解析: 一共有三种种类的糖果，每一种都有两个。
 *      最优分配方案：妹妹获得[1,2,3],弟弟也获得[1,2,3]。这样使妹妹获得糖果的种类数最多。
 * 示例 2 :
 *
 * 输入: candies = [1,1,2,3]
 * 输出: 2
 * 解析: 妹妹获得糖果[2,3],弟弟获得糖果[1,1]，妹妹有两种不同的糖果，弟弟只有一种。这样使得妹妹可以获得的糖果种类数最多。
 */
public class Solution {
    /**
     *
     * 判断糖果的种类。如果种类多余数量的一半，那么能拿到最多的种类就是数量的一半，
     * 如果种类的数量不足糖果数量的一半，那么能拿到所有的种类
     */
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < candies.length; i++) {
            set.add(candies[i]);
        }
        if (set.size()>candies.length/2){
            return candies.length/2;
        }else {
            return set.size();
        }

    }
}
