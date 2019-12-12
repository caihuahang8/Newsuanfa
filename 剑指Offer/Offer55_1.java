package 剑指Offer;

public class Offer55_1 {
    class TreeNode{
        int value;
        TreeNode left,right;
    }
    /**
     * 二叉树的深度
     */
    public int getDeepthOfBinaryTree( TreeNode root){
        if (root == null){
            return 0;
        }
        int left = getDeepthOfBinaryTree(root.left);
        int right = getDeepthOfBinaryTree(root.right);
        return Math.max(left,right) + 1 ;
    }
}
