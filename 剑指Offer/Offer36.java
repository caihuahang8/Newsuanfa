package 剑指Offer;

public class Offer36 {
    class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
    }

    private TreeNode pre = null;
    private TreeNode head = null;
    private TreeNode convert(TreeNode node){
        convertSub(node);
        return head;
    }
    private void convertSub(TreeNode node){
        if (node == null){
            return;
        }
        convertSub(node.left);
        if (head == null){
            head = node;
            pre = head;
        }else {
            node.left = pre;
            pre.right = node;
            node = head;
        }
        convertSub(node.right);
    }
}
