package com.shijc.leetcode._201_250._202
/**
 * 202.快乐数
 * happy number
 * 编写一个算法来判断一个数是不是“快乐数”。
 *
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
 * 然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，
 * 那么这个数就是快乐数。
 *
 * 示例:
 *
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
class SolutionKt {
    fun isHappy(n: Int): Boolean {

        var temp = n

        var list = setOf<Int>()

        while (true){

            if (temp == 1){
                return true
            }

            if (temp in list){
                return false
            }

            list.plus(temp)

            var sum = 0
            while (temp>0){
                sum += Math.pow((temp % 10).toDouble(), 2.0).toInt()
                temp /= 10
            }
            temp = sum
        }

    }
}

fun main(args: Array<String>) {
    val solution = SolutionKt()
    var result = solution.isHappy(19)
    println(result)
}

