package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Input:
 * "tree"
 *
 * Output:
 * "eert"
 */
public class SortCharactersByFrequency {
    public String sortCharByFrequency(String strs){
        //记录字母出现的次数
        Map<Character,Integer> frequencyMap = new HashMap<>();
        //计算每个key的次数
        for (char key:strs.toCharArray()){
            //储存key是每个字符，value是它们出现的次数
            frequencyMap.put(key,frequencyMap.getOrDefault(key,0)+1);
        }
        List<Character>[] bucket = new ArrayList[strs.length()+1];
        //下标是出现次数，里面储存的值是相应出现次数对应的字符
        for (char key:frequencyMap.keySet()){
            int freuency = frequencyMap.get(key);
            if (bucket[freuency] == null){
                bucket[freuency] = new ArrayList<>();
            }
            bucket[freuency].add(key);
        }
        //倒序取出出现次数多的数字填充字符串
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=bucket.length-1;i>=0;i--){
            if (bucket[i] == null){
                continue;
            }
            for (char c : bucket[i]){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
