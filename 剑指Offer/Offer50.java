package 剑指Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Offer50 {
    public int getNotRepeating(String str){
        int[] cnts = new int[str.length()];
        for (int i = 0;i<str.length();i++){
            cnts[str.charAt(i) - 'a']++;
        }
        for (int i =0;i < str.length();i++){
            if (cnts[i] ==1){
                return i;
            }
        }
        return -1;
    }
}
