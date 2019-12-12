package leetcode;

/**
 * 给定一个元素 n 代表有 [1, 2, ..., n] 版本，在第 x 位置开始出现错误版本，导致后面的版本都错误。可以调用 isBadVersion(int x) 知道某个版本是否错误，要求找到第一个错误的版本。
 */
public class FirstBadVersion {
    public int findBadNum(int bad){
        int r = bad;
        int l = 1;
        while (l<r){
            int mid = l+(r-l)/2;
            if (isBadVersion(mid)){
                r = mid;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }
    public boolean isBadVersion(int mid){
        return  false;
    }
}
