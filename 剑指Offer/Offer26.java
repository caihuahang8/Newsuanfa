package 剑指Offer;

import BinarySearch.BST;

public class Offer26<Key extends Comparable>{

    class TreeNode{
        Key key;
        TreeNode left,right;

    }

    private boolean hasChidrenTree(TreeNode root1,TreeNode root2){
        /**
         * 先判断有没有子节点
         */
        if (root1 == null || root2 == null){
            return false;
        }
        return hasChidrenTree(root1.left,root2) ||  hasChidrenTree(root2.right,root2) || isSubChidren(root1,root2);
    }
    private boolean isSubChidren(TreeNode treeNode1,TreeNode treeNode2){
        if (treeNode2==null){
            return true;
        }
        if (treeNode1==null){
            return false;
        }
        if (treeNode1.key.compareTo(treeNode2.key) == 0){
            return false;
        }
        return isSubChidren(treeNode1.left,treeNode1.left) && isSubChidren(treeNode1.right,treeNode2.left);
    }
}
