package leetcode;

import java.util.ArrayList;

/**
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * Copy to clipboardErrorCopied
 * 题目描述：在有序数组中找出两个数，使它们的和为 target。
 */
public class TwoSum {
    public  static  int[] twoNumbersSumFindByTarget(int[] sortNums, int target){
        if (sortNums == null|| sortNums.length ==0){
            return null;
        }
        //初始化两个指针
        int lastP = sortNums.length-1; //最后一个
        int firstP = 0; //第一个
        int sum=0;
        int result[] = new int[2];
        while (firstP<lastP){
            sum=sortNums[firstP]+sortNums[lastP];
            if (sum == target){
                result[0] = sortNums[firstP];
                result[1] = sortNums[lastP];
                return result;
            }else if (sum > target){
                lastP--;
            }else if (sum < target){
                firstP++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,7};
       int[] re = twoNumbersSumFindByTarget(numbers,5);
       int a = re[0];
       int b = re[1];
        System.out.printf("%d,%d",a,b);
        System.out.println(re[0]+","+re[1]);
         }


}
