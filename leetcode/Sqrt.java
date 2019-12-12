package leetcode;

/**
 * Input: 4
 * Output: 2
 *
 * Input: 8
 * Output: 2
 */
public class Sqrt {
    public int searchSqrt(int input){
        int l = 1;
        int r = input;
        //要找的数是sqrt
        while (l<=r) {
            int mid = (l + (r - l)) / 2;
            //判断条件就是sqrt=mid，要找到一个数字mid
            int sqrt = input/mid;
            if (sqrt == mid){
                return sqrt;
            }else if (sqrt > mid){
                l = mid + 1;
            }else if (sqrt < mid){
                r = mid - 1;
            }
        }
        return -1;
    }
    public int deSearchSqrt(int input){

        int l = 1; int r = input;
      int sqrt =   binarySearch(input,l,r);
      return sqrt;
    }
    private int binarySearch(int input,int l,int r){
        if (l>r){
            return -1;
        }
        int mid = (l+r)/2;
        int sqrt = input/mid;
        if (sqrt == mid){
            return sqrt;
        }else if (sqrt > mid){
            return binarySearch(input,mid + 1,r);
        }else {
            return binarySearch(input,l,mid - 1);
        }
    }
}
