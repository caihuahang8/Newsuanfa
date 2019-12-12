package 剑指Offer;

/**
 * 表示数组的字符串
 */
public class isNumber {
    private boolean isNumbers(char[] str){
        /**
         * []  ： 字符集合
         * ()  ： 分组
         * ?   ： 重复 0 ~ 1 次
         * +   ： 重复 1 ~ n 次
         * *   ： 重复 0 ~ n 次
         * .   ： 任意字符
         * \\. ： 转义后的 .
         * \\d ： 数字
         */
        return String.valueOf(str).matches("[+-]?\\d*(\\.\\d+)?([eE]?[-+]?\\d+)?");
    }
}
