package 剑指Offer;

import java.util.ArrayList;

/**
 * 输出所有和为 S 的连续正数序列。
 *
 * 例如和为 100 的连续序列有：
 * [9, 10, 11, 12, 13, 14, 15, 16]
 * [18, 19, 20, 21, 22]。
 */
public class Offer57_2 {
    public ArrayList<ArrayList<Integer>> continuePositiveSeq(int[] sequence,int targetS){
        /**
         * 用双指针形成一个窗口区域，因为是一个连续序列，它们之间的等差是1
         * 不断的向右移动两个指针来调整整个窗口，将整个窗口的值加起来判断是否等于目标值
         */
        //这两者之差等于窗口值
        ArrayList<ArrayList<Integer>>  results = new ArrayList<>();
        int startPointerNum =1;
        int lastPointerNum = 2;
        while (lastPointerNum > startPointerNum){
            //窗口值
            int sum = (startPointerNum + lastPointerNum) * (lastPointerNum - startPointerNum +1 )/2;
            if (sum == targetS){
                ArrayList<Integer> lists  = new ArrayList<>();
                for (int i  = startPointerNum ; i <= lastPointerNum; i ++){
                    lists.add(i);
                }
                results.add(lists);
            }else if (sum < targetS){
                lastPointerNum++;
            }else {
                startPointerNum++;
            }
        }
        return results;
    }
}
