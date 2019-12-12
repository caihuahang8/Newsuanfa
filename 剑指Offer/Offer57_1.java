package 剑指Offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入一个递增排序的数组和一个数字 S，在数组中查找两个数，使得他们的和正好是 S。如果有多对数字的和等于 S，输出两个数的乘积最小的。
 */
public class Offer57_1 {
    //两个指针一个在头一个在尾巴

   public ArrayList<Integer> findTwoNumbersAddToSum(int[] incArray,int targetS){
       int i = 0;
       int j = incArray.length- 1;
       int sum =0;
       while (i < j){
           /**
            * 加起来等于目标值返回一个ArrayList数组
            */
            sum = incArray[i] + incArray[j];
            if (sum == targetS){
                return new ArrayList<>(Arrays.asList(incArray[i],incArray[j]));
            }
           /**
            * 如果 sum > target，移动较大的元素，使 sum 变小一些；
            * 如果 sum < target，移动较小的元素，使 sum 变大一些。
            */
           if (sum < targetS){
                i++;
            }else {
                j--;
            }
       }
       return new ArrayList<>();
   }
}
