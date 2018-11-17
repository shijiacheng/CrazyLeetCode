package com.shijc.leetcode._501_550._520;

/**
 * 520.检测大写字母
 * detect capital
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 *
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 *
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 *
 * 示例 1:
 *
 * 输入: "USA"
 * 输出: True
 * 示例 2:
 *
 * 输入: "FlaG"
 * 输出: False
 * 注意: 输入是由大写和小写拉丁字母组成的非空单词。
 */
public class Solution {
    public boolean detectCapitalUse(String word) {

        char[] chars = word.toCharArray();

        if (word.length()==1){
//            if (word.charAt(1)-'a'>=0){
//
//            }
            return true;
        }

        int type = 0;//1 全小写，2全大写,3首字母大写

        if (chars[0]-'a'>=0){
            type = 1;
        }else if (chars[1]-'a'<0){
            type = 2;
        }else{
            type = 3;
        }


        for (int i = 1; i < chars.length; i++) {
            if (type == 1||type ==3){
                if (chars[i]>='A'&&chars[i]<='Z'){
                    return false;
                }
            }else if (type ==2){
                if (chars[i]>='a'){
                    return false;
                }
            }

        }

        return true;
    }
}
