package leetcode;



/**
 * Input:
 * letters = ["c", "f", "j"]
 * target = "d"
 * Output: "f"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "k"
 * Output: "c"
 * Copy to clipboardErrorCopied
 * 题目描述：给定一个有序的字符数组 letters 和一个字符 target，要求找出 letters 中大于 target 的最小字符，如果找不到就返回第 1 个字符。
 */
public class FindSmallestLetterGreaterThanTarget {
    public int findSmallestLetter(char[] letters,char target){
        if (letters.length==0&&letters==null){
            return -1;
        }
        int n = letters.length;
        int l =0;
        int r =letters.length-1;
        while (r>=l){
            int mid = l+(r-l)/2;
            if (letters[mid] <=target){
                l=mid + 1;
            }else {
                r=mid - 1;
            }
        }
        return l < n ? letters[l]:letters[0];
    }
}
