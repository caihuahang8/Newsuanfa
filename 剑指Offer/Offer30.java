package 剑指Offer;

import java.util.Stack;

public class Offer30 {
    private static Stack<Integer> dataStack = new Stack<Integer>();
    private static Stack<Integer> minStack = new Stack<Integer>();

    public static void push(Integer node){
        dataStack.push(node);
        minStack.push(minStack.isEmpty() ? node:minStack.peek());
    }
    public static void pop(){
        dataStack.pop();
        minStack.pop();
    }

    public static Integer top() {
        return dataStack.peek();
    }

    public static Integer min() {
        return minStack.peek();
    }

}
