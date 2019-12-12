package 剑指Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 *
 * 例如，如果输入数组 {2, 3, 4, 2, 6, 2, 5, 1} 及滑动窗口的大小 3，那么一共存在 6 个滑动窗口，他们的最大值分别为 {4, 4, 6, 6, 6, 5}。
 */
public class Offer58 {
    public ArrayList<Integer>  findMaxOfWindowVal(int[] arrs,int winVal){
        int n = arrs.length;
        if (n == 0){
            return new ArrayList<>();
        }
       ArrayList<Integer> arrayList = new ArrayList<>();
        int i=0;
        while (i < n){
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });
            for (int start = i;start< i+winVal;start++){
                maxHeap.add(arrs[start]);
            }
            arrayList.add(maxHeap.poll());
        }

        return arrayList;
    }

}
