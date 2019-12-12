package leetcode;

/**
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 * Copy to clipboardErrorCopied
 * 题目描述：判断一个非负整数是否为两个整数的平方和。
 */
public class SumofSquareNumbers {
    public static boolean judgeSumOfSquarNumbers(int target){
        if ( target <= 0){
            return false;
        }
        //先剪枝把后一个指针指向冗余的结果除去
        int firstNum = 0;
        int lastNum = target;
        int sum =0;
        //剪枝
        while (sum < lastNum*lastNum){
            sum =  lastNum*lastNum;
            lastNum--;
        }
        while (firstNum < lastNum){
            sum = (int) (firstNum*firstNum + lastNum*lastNum);
            if (sum == target){
                return true;
            }else if (sum < target){
                firstNum++;
            }else{
                lastNum--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
      boolean is=  judgeSumOfSquarNumbers(5);
      System.out.println(is);
    }
}
