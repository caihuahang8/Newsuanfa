package 剑指Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Offer32 <E extends Object> {
    class TreeNode{
        E value;
        TreeNode left,right;
        public TreeNode(E value){
            this.value = value;
            this.left=this.right = null;
        }
    }
    public ArrayList<E> printfBinaryFormTopToBottom(TreeNode root){
        ArrayList<E> arrayList = new ArrayList<E>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-- > 0){
               TreeNode treeNode =  queue.poll();
               if (treeNode == null){
                   continue;
               }
               arrayList.add(root.value);
               queue.add(root.left);
               queue.add(root.right);
            }
        }
        return arrayList;
    }
}
