package 剑指Offer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Offer41 {
    //保存输入的数据个数
    int N;
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2) {
          return   o2.compareTo(o1);
        }
    });

    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

    public void getMidVal(int val){
        if (N % 2 == 0){
            /**
             * 这可能是一个大于左边的值，但是先将它存入左边的优先队列，然后在用优先队列计算是否合格
             * 如果它真的大于左边的最大值，它就顺利存入右边，否则右边存储的值只是为了平衡两边的数而已。
             */
            maxHeap.offer(val);
            minHeap.add(maxHeap.poll());
        }else {
            minHeap.offer(val);
            maxHeap.offer(minHeap.poll());
        }
        N++;
    }
    private int getMidVal(){
        if (N %2 ==0){
            return  (minHeap.poll() + maxHeap.poll()) /2 ;
        }else {
            return minHeap.poll();
        }
    }
}
