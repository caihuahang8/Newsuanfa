package 剑指Offer;

import java.util.HashMap;

public class ConstructBinaryTree<Key extends Comparable,Value> {

    private class Node{
        Key key;
        int value;
        Node left,ringht;

        public Node(int value){
            this.value = value;
            left = ringht = null;
        }
    }

    private HashMap<Integer,Integer> inorderMap = new HashMap<Integer,Integer>();
    public Node  reConstructBinaryTree(int preorder[],int inorder[]){
        for (int i =0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return  reConstructBinaryTree(preorder,0,inorder.length-1,0);
    }
    public Node reConstructBinaryTree(int[] preorder,int preLeft,int preRight,int inLeft){

        Node root = new Node(preorder[preLeft]);
        int rootIndex = inorderMap.get(root.value);
        int leftTreeSize  = rootIndex - inLeft;
        root.left = reConstructBinaryTree(preorder,preLeft+1,rootIndex-1,inLeft);
        root.ringht = reConstructBinaryTree(preorder,rootIndex +1 ,preRight,inLeft +leftTreeSize +1);

        return root;
    }

}
