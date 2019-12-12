package 剑指Offer;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Offer60 {
    public List<Map.Entry<Integer,Double>> dicesSum(int dicesCount){
        final int face = 6;
        final int printSum = 6*dicesCount;
        long[][] results = new long[dicesCount+1][printSum+1];


        for (int i = 2;i <= dicesCount;i++){
            for (int j = i ; j <=printSum;j++){
                for (int k = 1 ; k <= j && k<= face;k++){
                    results[i][j] += results[i - 1][j - k];
                }
            }
        }
        final double totalNum = Math.pow(6,dicesCount);
        List<Map.Entry<Integer,Double>> ret =  new ArrayList<>();
        for (int i =dicesCount;i <= printSum;i++){
            ret.add(new AbstractMap.SimpleEntry<>(i,results[dicesCount][i]/totalNum));
        }
        return ret;
    }
}
