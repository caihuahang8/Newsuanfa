package 剑指Offer;

import java.util.Arrays;
import java.util.Comparator;

public class Offer45  {
    private String printMinNumbers(Integer[] nums){
        if (nums.length == 0  ){
            return null;
        }
        String[] strNumbers = new String[nums.length];
        for (int i = 0; i < nums.length ;i++){
            strNumbers[i] = nums[i] + "";
        }
        Arrays.sort(strNumbers,new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });
        String res = "";
        for (String str : strNumbers){
            res+=str;
        }
        return res;
    }


}
