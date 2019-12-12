package 剑指Offer;

import java.util.ArrayList;

public class Offer34 {
    class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value){
            this.value = value;
            this.left = this.right = null;
        }
    }


    ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> findPath(TreeNode rootNode , int target){
        if (rootNode == null || target == 0){
            return null;
        }
        backtracking(rootNode,target,new  ArrayList<Integer>());
        return arrayLists;
    }
    private void backtracking(TreeNode treeNode,int target,ArrayList<Integer> path){
        if (treeNode == null){
            return;
        }
        path.add(treeNode.value);
        target -=treeNode.value;
        if (target == 0 &&  treeNode.left== null && treeNode.right == null){
            arrayLists.add(path);
        }else {
            backtracking(treeNode.left,target,path);
            backtracking(treeNode.right,target,path);
        }
        path.remove(path.size() - 1);
    }
}
