package leetcode;

/**
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class LastPositionofElementinSortedArray {
    public int[] findPositionOfFirstToLast(int[] nums,int target){
        int first  = binarySearch(nums,target);
        int last = binarySearch(nums,target+1)-1;
        if (first == nums.length || nums[first] !=target ){
            return new int[]{-1,-1};
        }else {
            return new int[]{first,last};
        }
    }

    private int binarySearch(int[] nums,int target){
        int l=0; int r = nums.length;
        while (l<r){
            int mid = l+(r-l)/2;
            if (nums[mid] >= target){
                r = mid;
            }else {
                l = mid+1;
            }
        }
        return l;
    }
}
