package 剑指Offer;

import org.omg.PortableInterceptor.INACTIVE;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * k表示要最小的几个数
 * 使用最大堆来实现这个算法
 */
public class Offer40 {
    public ArrayList<Integer> getLastNumbers(Integer[] arr,int k){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (arr.length == 0){
            return null;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(arr.length, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0;i < arr.length; i++){
            if(maxHeap.size() !=  k  ){
                maxHeap.offer(arr[i]);
            }else if (maxHeap.peek() > arr[i]){
                Integer temp = maxHeap.poll();
                temp = null;
                maxHeap.add(arr[i]);
            }
        }
        return result;
    }
}
