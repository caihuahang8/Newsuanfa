package 剑指Offer;

public class Offer37 {
    class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value){
            this.value = value;
        }
    }
    private String deSerializeSizeStr =  null;
    private String serialize(TreeNode root){
        if (root == null){
            return "$";
        }
        return root.value+" "+serialize(root.left)+" "+serialize(root.right);
    }

    private void  deSerializeBinary(String str){
        deSerializeSizeStr = str;
        deSerialize();
    }
    private  TreeNode deSerialize(){
        if (deSerializeSizeStr.length() == 0){
            return null;
        }
        int index = deSerializeSizeStr.lastIndexOf(' ');
        String node = index == -1 ? deSerializeSizeStr : deSerializeSizeStr.substring(0,index);
        deSerializeSizeStr = index == -1 ? "":deSerializeSizeStr.substring(index+1);
        if (node.equals("$")){
            return null;
        }
        int val =    Integer.valueOf(node);
        TreeNode t = new TreeNode(val);
        t.left = deSerialize();
        t.right = deSerialize();
        return t;
    }
}
