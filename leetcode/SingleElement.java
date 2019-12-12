package leetcode;

import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

/**
 * Input: [1, 1, 2, 3, 3, 4, 4, 8, 8]
 * Output: 2
 * 题目描述：一个有序数组只有一个数不出现两次，找出这个数。
 */
public class SingleElement {
    public int findSingeleDupcliate(int[] arrs,int target){
        int l = 0;
        int r = arrs.length-1;
        while (l<r){
            int mid = (l+r)/2;
            if (arrs[mid] % 2 ==1){
                mid--; // 变成偶数
            }
            if (arrs[mid] == arrs[mid+1]){
                l = mid +2;
            }else {
                r = mid ;
            }
        }
        return arrs[l];
    }
}
