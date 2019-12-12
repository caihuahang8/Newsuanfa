package 剑指Offer;

/**
 * Input:
 * {2, 3, 1, 0, 2, 5}
 *
 * Output:
 * 2
 */
public class Offer1 {
    public static boolean Duplication(int[] nums){
        if (nums==null&&nums.length==0){
            return false;
        }
        int[] dup = new int[1] ;
        for (int i=0;i<nums.length;i++){
            while (nums[i] != i){
                if (nums[i] == nums[nums[i]]){
                   dup[0] = nums[i];
                   return  true;
                }
                swap(nums,i,nums[i]);
            }
        }
        return false;
    }
    private  static void swap(int[] nums,int k,int j){
        int temp = nums[k];
        nums[j] = nums[k];
        nums[k] = temp;
    }

    public static void main(String[] args) {
        int[] arrs = {2,3,1,0,2,5};
        boolean b =Duplication(arrs);
        System.out.println(b);
    }
}
