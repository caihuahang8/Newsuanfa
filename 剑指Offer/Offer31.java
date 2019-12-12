package 剑指Offer;

import java.util.Stack;

/**
 * 根据压入的第一序列，判断第二序列弹出序列是否正确
 */
public class Offer31 {
    //模拟第一序列压入
    public boolean isPopOrder(int[] popSe, int[] pushSe){
        int n = pushSe.length;
        Stack<Integer> stack = new Stack<Integer>();
        for (int popIndex = 0 , pushIndex = 0; pushIndex < n  ;pushIndex++  ){
            stack.push(pushSe[pushIndex]);
            while (popIndex < n && !stack.isEmpty() && stack.peek() == popSe[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
