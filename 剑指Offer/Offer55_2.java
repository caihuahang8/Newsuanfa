package 剑指Offer;

public class Offer55_2 {
    class TreeNode{
        int value;
        TreeNode left,right;
    }
    boolean isBalance = true;
    public int isAVL(TreeNode root){
        if (root == null || !isBalance){
            return 0;
        }
        int left = isAVL(root.left);
        int right = isAVL(root.right);
        if (Math.abs(left - right) > 1){
            isBalance = false;
        }
        return 1+Math.max(left,right);

    }
}
