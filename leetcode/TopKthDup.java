package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 */
public class TopKthDup {
    public  static  List<Integer> findTopKth(int[] nums,int k){
        //记录每个key的频率
        Map<Integer,Integer> frequencyForNum = new HashMap<>();
        for (int key: nums){
            frequencyForNum.put(key,frequencyForNum.getOrDefault(key,0)+1);
        }
        //维护一个桶添加key,下标是出现次数，里面存储的值是出现的数字
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for (int key:frequencyForNum.keySet()){
            int frequencyNum = frequencyForNum.get(key);
            if (bucket[frequencyNum]==null){
                bucket[frequencyNum] = new ArrayList<>();
            }
            bucket[frequencyNum].add(key);
        }
        List<Integer> topK = new ArrayList<>();
        for (int i = nums.length-1;i>=0 && topK.size()<k;i--){
            if (bucket[i] == null){
                continue;
            }
            if (bucket[i].size()<=(k - topK.size())){
                topK.addAll(bucket[i]);
            }else {
                topK.addAll(bucket[i].subList(0,k - topK.size()));
            }
        }
        return topK;
    }

    public static void main(String[] args) {
       int[] arr = {1,2,3,4,1,5};
       List<Integer> k =  findTopKth(arr,2);
       System.out.println(k.get(2));


    }
}
