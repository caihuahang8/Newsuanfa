package 剑指Offer;

public class Offer54 {
    class TreeNode{
        int value;
        TreeNode left,right;
    }
    int count =0;//标记第几个节点
    TreeNode node;//第K个节点
    public TreeNode getKnode(TreeNode root,int k ){
        inOrder(root,k);
        return node;
    }
    private void inOrder(TreeNode root,int k){
        if (root == null || count >=k){
            return; //没有结果
        }
        inOrder(root.left,k);
        count++;
        if (count == k){
            node = root;
        }
        inOrder(root.right,k);
    }

}
