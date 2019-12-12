package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 * Copy to clipboardErrorCopied
 * 题目描述：找到倒数第 k 个的元素。
 */
public class KthElement {
    public int findKthEelementByArrays(int[] nums,int k){
        //1 2 3 4 5 6
        Arrays.sort(nums);
        return nums[nums.length -k];
    }
    public int findKthElemetngByHeap(int[] nums,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.add(num);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
    public int findKthElementByQuickSort(int[] nums,int k){

        //先进行二分
        quickSort(nums,0,nums.length);

        return nums[k];
    }

    public void quickSort(int[] nums,int l,int r){

        assert l >= r && nums==null;
        int p  = partition(nums,l,r);

        quickSort(nums,l,p);
        quickSort(nums,p+1,r);

    }
    public int partition(int[] nums,int l,int r){
        //来进行比较的
        int v = nums[l];

        int j = l;
        for (int i=j+1;i<r;i++){
            if (nums[i] < v){
                swap(nums,j,i);
            }
        }
        swap(nums,l,j);
        return j;
    }
    private void swap(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
