package 剑指Offer;

public class Offer53 {
    /**
     * 数字在排序数组中出现的次数
     * Input:
     * nums = 1, 2, 3, 3, 3, 3, 4, 6
     * K = 3
     *
     * Output:
     * 4
     * 利用二分查找
     */
    public int getRepeatNumbersOfTimes(int[] numbers,int k ){
      int firstIndex =   binarySearch(numbers,k);
      int lastIndex = binarySearch(numbers,k+1);
      return (lastIndex - firstIndex) > 0? lastIndex-firstIndex:0;
    }
    public  static  int binarySearch(int[] numbers,int k ){
        int left =0;
        int right = numbers.length-1 ;
        while (left < right){
            int mid = left + (right-left) / 2;
            if (numbers[mid] >= k ){
                right = mid;
            }else {
                left =  mid +1 ;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 3, 4, 6,7};
        int i =binarySearch(nums,3);
        int o = binarySearch(nums,4);
        System.out.println(o - i);
    }
}
