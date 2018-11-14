package com.shijc.leetcode._351_400._374;

/**
 * 374.猜数字大小
 * guess number higher or lower
 * 我们正在玩一个猜数字游戏。 游戏规则如下：
 * 我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
 * 每次你猜错了，我会告诉你这个数字是大了还是小了。
 * 你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
 *
 * -1 : 我的数字比较小
 *  1 : 我的数字比较大
 *  0 : 恭喜！你猜对了！
 * 示例 :
 *
 * 输入: n = 10, pick = 6
 * 输出: 6
 */
public class Solution {
    public int guessNumber(int n) {

        int start = 1;
        int end = n;
        while (start<=end){
            int mid = (end- start)/2+start;
            if (guess(mid) == 0){
                return mid;
            }else if (guess(mid) == -1){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }

        return -1;

    }

    private int guess(int num){
        return 0;
    }
}
