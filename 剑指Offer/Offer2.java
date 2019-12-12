package 剑指Offer;

/**
 * Consider the following matrix:
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 *
 * Given target = 5, return true.
 * Given target = 20, return false.
 */
public class Offer2 {
    public boolean followingMatrix(int target,int[][] martix){
        int cols = martix[0].length;
        int rows = martix.length;
        if (cols==0&&rows==0){
            return false;
        }
        int col=cols,row=0;
        while (col>=0&&row<= rows-1){
            if (martix[row][col]==target){
                return true;
            }else if (martix[row][col] > target){
                col--;
            }else if (martix[row][col] < target){
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
