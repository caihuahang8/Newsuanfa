package leetcode;

/**
 * Input: [3,4,5,1,2],
 * Output: 1
 * 数组
 */
public class FindMinimuminRotatedSortedArray {
    public int findMinRotatedSortedArray(int[] arrs){
        int l = 0;
        int r = arrs.length-1;
        //[l,r]
        while (l<r){
            int mid = l+(r-l)/2;
            if (arrs[mid] <= arrs[r]){
                //[l,mid],已经回到排序的开头；例如到了数组值1的后面
                r = mid;
            }else {
                //[mid+1,r]，还在前面的排序数组，不断缩小前面的数值
                l = mid+1;
            }
        }
        return l;
    }
}
