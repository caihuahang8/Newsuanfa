package BinarySearch;

public class BST3 <Key extends  Comparable,Value>{
    private class Node{
        Key key;
        Value value;
        Node left,right;
        public  Node(Key key,Value value){
            this.key= key;
            this.value = value;
            left = right = null;
        }
    }

    Node root;
    int count;
    public BST3(){
        this.root = null;
        this.count = 0;
    }

    public void insert(Key key,Value value){
        insert(root,key,value);
    }
    public Node  insert(Node node,Key key,Value value){
        if (node == null){
            return new Node(key,value);
        }

        if (node.key.compareTo(node.key) == 0){
            node.value = value;
        }else if (node.key.compareTo(node.key) < 0){
            node.left  = insert(node.left,key,value);
        }else {
            node.right = insert(node.right,key,value);
        }
        return node;
    }


}
