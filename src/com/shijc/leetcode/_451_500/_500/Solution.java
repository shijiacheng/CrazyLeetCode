package com.shijc.leetcode._451_500._500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 500.键盘行
 * keyboard row
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 *
 * American keyboard
 *
 * 示例：
 *
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *
 *
 * 注意：
 *
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母。
 */
public class Solution {
    public String[] findWords(String[] words) {

        Map<Character,Integer> map = new HashMap<>();
        map.put('Q',1);
        map.put('W',1);
        map.put('E',1);
        map.put('R',1);
        map.put('T',1);
        map.put('Y',1);
        map.put('U',1);
        map.put('I',1);
        map.put('O',1);
        map.put('P',1);

        map.put('A',2);
        map.put('S',2);
        map.put('D',2);
        map.put('F',2);
        map.put('G',2);
        map.put('H',2);
        map.put('J',2);
        map.put('K',2);
        map.put('L',2);

        map.put('Z',3);
        map.put('X',3);
        map.put('C',3);
        map.put('V',3);
        map.put('B',3);
        map.put('N',3);
        map.put('M',3);

        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() ==1){
                list.add(words[i]);
                continue;
            }

            int flag = 0;
            char c0 = words[i].charAt(0);
            if (c0 >= 97){
                flag = map.get((char)(c0-32));
            }else {
                flag = map.get(words[i].charAt(0));
            }
            for (int j = 1; j < words[i].length(); j++) {

                char c = words[i].charAt(j);
                if (c >= 97){
                    if (flag != map.get((char) (c-32))){
                        break;
                    }
                }else {
                    if (flag != map.get(words[i].charAt(j))){
                        break;
                    }
                }
                if (j == words[i].length()-1){
                    list.add(words[i]);
                }
            }
        }

        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;

    }

    public static void main(String[] args){
        String[] strings = {"Hello", "Alaska", "Dad", "Peace"};
        Solution solution = new Solution();
        String[] result = solution.findWords(strings);
        System.out.println(result.length);
    }
}
