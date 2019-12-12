package 剑指Offer;

public class DeleteNode<Node,Value> {
    private class Node{
        Node next;
        Value value;
        public Node(){
        }
    }

    private DeleteNode.Node deleteNode(DeleteNode.Node delnode, DeleteNode.Node head){
        if (delnode == null || head == null){
            return null;
        }
        if (delnode.next != null){
            DeleteNode.Node pNext = delnode.next;
            delnode.value = pNext.value;
            delnode.next  = pNext.next;
        }else {
            if (head == delnode){
                head = null;
            }else {
                DeleteNode.Node currentNode = head;
                while (currentNode.next != delnode){
                    currentNode = currentNode.next;
                }
                currentNode.next = null;
            }
        }
        return head;
    }
}
