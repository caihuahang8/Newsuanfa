package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 */
public class TopKthDup2 {
    public List<Integer>  findByTopKth(int[] nums,int k){
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for (int key : nums){
            frequencyMap.put(key,frequencyMap.getOrDefault(key,0)+1 );
        }
        List<Integer>[] bucket = new ArrayList[nums.length +1];
        for (int key : frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(frequencyMap.get(key));
        }
        List<Integer> topK = new ArrayList<>();
        for (int i = bucket.length -1;i >0 && topK.size()<k;i--  ){
            if (bucket[i]==null){
                continue;
            }
            if (bucket[i].size() <  k -topK.size()){
                topK.addAll(bucket[i]);
            }else {
                topK.addAll(bucket[i].subList(0, k - topK.size()));
            }
        }
        return topK;
    }
}
