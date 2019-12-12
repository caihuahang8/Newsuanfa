package leetcode;

/**
 * Input : [1,2,3,4,5]
 * key : 3
 * return the index : 2
 */
public class binarySearch {
    public int binarySerch(int target,int[] nums){
        int l=0;
        int r= nums.length-1;
        int index =  search(nums,l,r,target);
        return index;
    }

    public int search(int[] nums,int l,int r,int target){
        if (l>r){
            return -1;
        }
        int mid = (l+r)/2;
        if (nums[mid] == target ){
            return mid;
        }else if (nums[mid] > target){
            return search(nums,l,mid-1,target);
        }else if (nums[mid] < target){
            return search(nums,mid+1,r,target);
        }
        return -1;
    }
}
